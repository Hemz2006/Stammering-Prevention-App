package com.stammer.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityLogInBinding
import com.stammer.app.extensions.NoInternetConnection
import com.stammer.app.extensions.hideKeyboard
import com.stammer.app.extensions.isJSONObject
import com.stammer.app.extensions.isValidPassword
import com.stammer.app.extensions.showProgressDialog
import com.stammer.app.modules.homepage.ui.HomePageActivity
import com.stammer.app.modules.login.`data`.viewmodel.LogInVM
import com.stammer.app.modules.loginscreen.ui.LoginScreenActivity
import com.stammer.app.network.models.createlogin.CreateLoginResponse
import com.stammer.app.network.resources.ErrorResponse
import com.stammer.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LogInActivity : BaseActivity<ActivityLogInBinding>(R.layout.activity_log_in) {
  private val viewModel: LogInVM by viewModels<LogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = LoginScreenActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnLogIn.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
    binding.etFrameThirtyOne.setOnClickListener {
      if(
      viewModel.logInModel.value?.etFrameThirtyOneValue.
      isValidPassword(true)) {
        this@LogInActivity.hideKeyboard()
        viewModel.callCreateLoginApi()
      }
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@LogInActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@LogInActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createLoginLiveData.observe(this@LogInActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateLogin(it)
      } else if(it is ErrorResponse) {
        onErrorCreateLogin(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>): Unit {
    viewModel.bindCreateLoginResponse(response.data)
    val destIntent = HomePageActivity.getIntent(this, null)
    destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    startActivity(destIntent)
  }

  private fun onErrorCreateLogin(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        val errMessage = if(!errorObject.optString("status").isNullOrEmpty()) {
          errorObject.optString("status").toString()
        } else {
          exception.response()?.message()?:""
        }
        Snackbar.make(binding.root, errMessage, Snackbar.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
