package com.stammer.app.modules.coursepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.coursepage.`data`.model.CoursePageModel
import org.koin.core.KoinComponent

class CoursePageVM : ViewModel(), KoinComponent {
  val coursePageModel: MutableLiveData<CoursePageModel> = MutableLiveData(CoursePageModel())

  var navArguments: Bundle? = null
}
