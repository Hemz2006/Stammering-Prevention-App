package com.stammer.app.modules.courseshowcase.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class CourseShowcaseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYOURRESULTS: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_results)
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
