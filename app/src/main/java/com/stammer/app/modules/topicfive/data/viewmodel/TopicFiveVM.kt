package com.stammer.app.modules.topicfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.topicfive.`data`.model.TopicFiveModel
import org.koin.core.KoinComponent

class TopicFiveVM : ViewModel(), KoinComponent {
  val topicFiveModel: MutableLiveData<TopicFiveModel> = MutableLiveData(TopicFiveModel())

  var navArguments: Bundle? = null
}
