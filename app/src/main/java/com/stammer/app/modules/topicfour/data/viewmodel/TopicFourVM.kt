package com.stammer.app.modules.topicfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.topicfour.`data`.model.TopicFourModel
import org.koin.core.KoinComponent

class TopicFourVM : ViewModel(), KoinComponent {
  val topicFourModel: MutableLiveData<TopicFourModel> = MutableLiveData(TopicFourModel())

  var navArguments: Bundle? = null
}
