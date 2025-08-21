package com.stammer.app.modules.courseshowcase.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class ListpriceRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_stammering_cour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt45minutesago: String? =
      MyApp.getInstance().resources.getString(R.string.msg_taught_by_heman)

)
