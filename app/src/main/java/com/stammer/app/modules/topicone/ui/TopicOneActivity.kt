package com.stammer.app.modules.topicone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityTopicOneBinding
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.topicfive.ui.TopicFiveActivity
import com.stammer.app.modules.topicfour.ui.TopicFourActivity
import com.stammer.app.modules.topicone.`data`.viewmodel.TopicOneVM
import com.stammer.app.modules.topicthree.ui.TopicThreeActivity
import com.stammer.app.modules.topictwo.ui.TopicTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopicOneActivity : BaseActivity<ActivityTopicOneBinding>(R.layout.activity_topic_one) {
  private val viewModel: TopicOneVM by viewModels<TopicOneVM>()

  private val REQUEST_CODE_TOPIC_FIVE_ACTIVITY: Int = 102


  private val REQUEST_CODE_TOPIC_TWO_ACTIVITY: Int = 826


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.topicOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTopicThree.setOnClickListener {
      val destIntent = TopicThreeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnTopicFour.setOnClickListener {
      val destIntent = TopicFourActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnTopicFive.setOnClickListener {
      val destIntent = TopicFiveActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TOPIC_FIVE_ACTIVITY)
    }
    binding.btnTopicTwo.setOnClickListener {
      val destIntent = TopicTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TOPIC_TWO_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = CoursePageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "TOPIC_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopicOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
