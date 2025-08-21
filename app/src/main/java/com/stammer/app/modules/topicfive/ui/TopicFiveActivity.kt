package com.stammer.app.modules.topicfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityTopicFiveBinding
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.topicfive.`data`.viewmodel.TopicFiveVM
import com.stammer.app.modules.topicfour.ui.TopicFourActivity
import com.stammer.app.modules.topicone.ui.TopicOneActivity
import com.stammer.app.modules.topicthree.ui.TopicThreeActivity
import com.stammer.app.modules.topictwo.ui.TopicTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopicFiveActivity : BaseActivity<ActivityTopicFiveBinding>(R.layout.activity_topic_five) {
  private val viewModel: TopicFiveVM by viewModels<TopicFiveVM>()

  private val REQUEST_CODE_TOPIC_THREE_ACTIVITY: Int = 219

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.topicFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTopicTwo.setOnClickListener {
      val destIntent = TopicTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnTopicThree.setOnClickListener {
      val destIntent = TopicThreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TOPIC_THREE_ACTIVITY)
    }
    binding.btnTopicFour.setOnClickListener {
      val destIntent = TopicFourActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnTopicOne.setOnClickListener {
      val destIntent = TopicOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = CoursePageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "TOPIC_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopicFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
