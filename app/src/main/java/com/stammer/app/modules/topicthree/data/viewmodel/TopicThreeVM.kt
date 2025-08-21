package com.stammer.app.modules.topicthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.topicthree.`data`.model.TopicThreeModel
import org.koin.core.KoinComponent

class TopicThreeVM : ViewModel(), KoinComponent {
  val topicThreeModel: MutableLiveData<TopicThreeModel> = MutableLiveData(TopicThreeModel())

  var navArguments: Bundle? = null
}
