package com.stammer.app.modules.topicone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.topicone.`data`.model.TopicOneModel
import org.koin.core.KoinComponent

class TopicOneVM : ViewModel(), KoinComponent {
  val topicOneModel: MutableLiveData<TopicOneModel> = MutableLiveData(TopicOneModel())

  var navArguments: Bundle? = null
}
