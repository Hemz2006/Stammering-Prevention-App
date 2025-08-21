package com.stammer.app.modules.courseshowcase.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityCourseShowcaseBinding
import com.stammer.app.modules.courseshowcase.`data`.model.ListpriceRowModel
import com.stammer.app.modules.courseshowcase.`data`.viewmodel.CourseShowcaseVM
import com.stammer.app.modules.detailedprofile.ui.DetailedProfileActivity
import com.stammer.app.modules.homepage.ui.HomePageActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CourseShowcaseActivity :
    BaseActivity<ActivityCourseShowcaseBinding>(R.layout.activity_course_showcase) {
  private val viewModel: CourseShowcaseVM by viewModels<CourseShowcaseVM>()

  private val REQUEST_CODE_DETAILED_PROFILE_ACTIVITY: Int = 680


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceRowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(this) {
      listpriceAdapter.updateData(it)
    }
    binding.courseShowcaseVM = viewModel
    setUpSearchViewGroup9020Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = DetailedProfileActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageHome.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageRamOne.setOnClickListener {
      val destIntent = DetailedProfileActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_DETAILED_PROFILE_ACTIVITY)
    }
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: ListpriceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup9020Listener(): Unit {
    binding.searchViewGroup9020.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "COURSE_SHOWCASE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, CourseShowcaseActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
