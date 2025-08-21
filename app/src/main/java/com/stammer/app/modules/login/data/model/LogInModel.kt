package com.stammer.app.modules.login.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginyouracco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_your_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyOneValue: String? = null
)
