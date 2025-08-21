package com.stammer.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stammer.app.appcomponents.utility.PreferenceHelper
import com.stammer.app.modules.login.`data`.model.LogInModel
import com.stammer.app.network.models.createlogin.CreateLoginRequest
import com.stammer.app.network.models.createlogin.CreateLoginResponse
import com.stammer.app.network.repository.NetworkRepository
import com.stammer.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class LogInVM : ViewModel(), KoinComponent {
  val logInModel: MutableLiveData<LogInModel> = MutableLiveData(LogInModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateLoginApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      contentType = """application/json""",
          createLoginRequest = CreateLoginRequest(
          password = logInModel.value?.etFrameThirtyOneValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse) {
    val logInModelValue = logInModel.value ?:LogInModel()
    prefs.setTOKEN(response.status)
    logInModel.value = logInModelValue
  }
}
