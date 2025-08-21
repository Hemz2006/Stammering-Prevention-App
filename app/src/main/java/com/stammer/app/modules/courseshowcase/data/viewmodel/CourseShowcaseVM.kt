package com.stammer.app.modules.courseshowcase.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.courseshowcase.`data`.model.CourseShowcaseModel
import com.stammer.app.modules.courseshowcase.`data`.model.ListpriceRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CourseShowcaseVM : ViewModel(), KoinComponent {
  val courseShowcaseModel: MutableLiveData<CourseShowcaseModel> =
      MutableLiveData(CourseShowcaseModel())

  var navArguments: Bundle? = null

  val listpriceList: MutableLiveData<MutableList<ListpriceRowModel>> =
      MutableLiveData(mutableListOf())
}
