package com.stammer.app.modules.topicthree.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class TopicThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_this_course_wil2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceOneValue: String? = null
)
