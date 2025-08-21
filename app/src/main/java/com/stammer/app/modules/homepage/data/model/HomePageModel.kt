package com.stammer.app.modules.homepage.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWELCOME: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSTAMMERINGCURE: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_stammering_cure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_perfect_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
