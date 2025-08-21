package com.stammer.app.modules.detailedprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.stammer.app.modules.detailedprofile.`data`.model.DetailedProfileModel
import org.koin.core.KoinComponent

class DetailedProfileVM : ViewModel(), KoinComponent {
  val detailedProfileModel: MutableLiveData<DetailedProfileModel> =
      MutableLiveData(DetailedProfileModel())

  var navArguments: Bundle? = null
}
