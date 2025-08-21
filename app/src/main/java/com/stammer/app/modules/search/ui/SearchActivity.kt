package com.stammer.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivitySearchBinding
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.courseshowcase.ui.CourseShowcaseActivity
import com.stammer.app.modules.search.`data`.viewmodel.SearchVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  private val REQUEST_CODE_COURSE_PAGE_ACTIVITY: Int = 614


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnOpen.setOnClickListener {
      val destIntent = CoursePageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_COURSE_PAGE_ACTIVITY)
    }
    binding.txtPrice.setOnClickListener {
      val destIntent = CourseShowcaseActivity.getIntent(this, null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEARCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
