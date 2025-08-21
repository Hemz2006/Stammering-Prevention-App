package com.stammer.app.modules.search.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecently: String? = MyApp.getInstance().resources.getString(R.string.lbl_recently)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_stammering_cour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourefriends: String? = MyApp.getInstance().resources.getString(R.string.lbl_join_quick)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup9116Value: String? = null
)
