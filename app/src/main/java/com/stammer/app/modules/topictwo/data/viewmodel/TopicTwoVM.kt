package com.stammer.app.modules.topictwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.topictwo.`data`.model.TopicTwoModel
import org.koin.core.KoinComponent

class TopicTwoVM : ViewModel(), KoinComponent {
  val topicTwoModel: MutableLiveData<TopicTwoModel> = MutableLiveData(TopicTwoModel())

  var navArguments: Bundle? = null
}
