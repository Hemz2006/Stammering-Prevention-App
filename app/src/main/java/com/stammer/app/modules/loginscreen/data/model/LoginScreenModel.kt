package com.stammer.app.modules.loginscreen.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class LoginScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTITLE: String? = MyApp.getInstance().resources.getString(R.string.lbl_stammering_cure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_your_one_stop_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrloginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)

)
