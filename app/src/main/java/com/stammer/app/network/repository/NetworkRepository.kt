package com.stammer.app.network.repository

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import com.stammer.app.extensions.NoInternetConnection
import com.stammer.app.extensions.isOnline
import com.stammer.app.network.RetrofitServices
import com.stammer.app.network.models.createlogin.CreateLoginRequest
import com.stammer.app.network.models.createlogin.CreateLoginResponse
import com.stammer.app.network.resources.ErrorResponse
import com.stammer.app.network.resources.Response
import com.stammer.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun createLogin(contentType: String?, createLoginRequest: CreateLoginRequest?):
      Response<CreateLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createLogin(contentType, createLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
