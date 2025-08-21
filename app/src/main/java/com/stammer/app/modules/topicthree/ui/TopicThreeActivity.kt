package com.stammer.app.modules.topicthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityTopicThreeBinding
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.topicfive.ui.TopicFiveActivity
import com.stammer.app.modules.topicfour.ui.TopicFourActivity
import com.stammer.app.modules.topicone.ui.TopicOneActivity
import com.stammer.app.modules.topicthree.`data`.viewmodel.TopicThreeVM
import com.stammer.app.modules.topictwo.ui.TopicTwoActivity
import kotlin.String
import kotlin.Unit

class TopicThreeActivity : BaseActivity<ActivityTopicThreeBinding>(R.layout.activity_topic_three) {
  private val viewModel: TopicThreeVM by viewModels<TopicThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.topicThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTopicFive.setOnClickListener {
      val destIntent = TopicFiveActivity.getIntent(this, null)
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
    binding.btnTopicTwo.setOnClickListener {
      val destIntent = TopicTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnTopicFour.setOnClickListener {
      val destIntent = TopicFourActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "TOPIC_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopicThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
