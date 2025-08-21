package com.stammer.app.modules.signup.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaNewAc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_new_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItsfastande: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_s_fast_and_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_by_clicking_reg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySevenValue: String? = null
)
