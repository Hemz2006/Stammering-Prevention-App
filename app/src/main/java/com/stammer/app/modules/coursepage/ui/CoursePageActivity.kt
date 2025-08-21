package com.stammer.app.modules.coursepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityCoursePageBinding
import com.stammer.app.modules.coursepage.`data`.viewmodel.CoursePageVM
import com.stammer.app.modules.courseshowcase.ui.CourseShowcaseActivity
import com.stammer.app.modules.topicone.ui.TopicOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CoursePageActivity : BaseActivity<ActivityCoursePageBinding>(R.layout.activity_course_page) {
  private val viewModel: CoursePageVM by viewModels<CoursePageVM>()

  private val REQUEST_CODE_TOPIC_ONE_ACTIVITY: Int = 199


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.coursePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = TopicOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_TOPIC_ONE_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = CourseShowcaseActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "COURSE_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CoursePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
