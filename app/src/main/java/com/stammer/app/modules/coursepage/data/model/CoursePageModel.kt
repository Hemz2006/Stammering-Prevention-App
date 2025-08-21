package com.stammer.app.modules.coursepage.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class CoursePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_stammering_cur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_this_course_wil)

)
