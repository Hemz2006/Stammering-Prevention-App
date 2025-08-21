package com.stammer.app.modules.topicfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityTopicFourBinding
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.topicfive.ui.TopicFiveActivity
import com.stammer.app.modules.topicfour.`data`.viewmodel.TopicFourVM
import com.stammer.app.modules.topicone.ui.TopicOneActivity
import com.stammer.app.modules.topicthree.ui.TopicThreeActivity
import com.stammer.app.modules.topictwo.ui.TopicTwoActivity
import kotlin.String
import kotlin.Unit

class TopicFourActivity : BaseActivity<ActivityTopicFourBinding>(R.layout.activity_topic_four) {
  private val viewModel: TopicFourVM by viewModels<TopicFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.topicFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
    binding.btnTopicThree.setOnClickListener {
      val destIntent = TopicThreeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
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
  }

  companion object {
    const val TAG: String = "TOPIC_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopicFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
