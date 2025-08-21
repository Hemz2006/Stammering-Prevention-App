package com.stammer.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.stammer.app.R
import com.stammer.app.appcomponents.base.BaseActivity
import com.stammer.app.databinding.ActivityAppNavigationBinding
import com.stammer.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.stammer.app.modules.coursepage.ui.CoursePageActivity
import com.stammer.app.modules.courseshowcase.ui.CourseShowcaseActivity
import com.stammer.app.modules.detailedprofile.ui.DetailedProfileActivity
import com.stammer.app.modules.homepage.ui.HomePageActivity
import com.stammer.app.modules.login.ui.LogInActivity
import com.stammer.app.modules.loginscreen.ui.LoginScreenActivity
import com.stammer.app.modules.search.ui.SearchActivity
import com.stammer.app.modules.signup.ui.SignUpActivity
import com.stammer.app.modules.splash.ui.SplashActivity
import com.stammer.app.modules.topicfive.ui.TopicFiveActivity
import com.stammer.app.modules.topicfour.ui.TopicFourActivity
import com.stammer.app.modules.topicone.ui.TopicOneActivity
import com.stammer.app.modules.topicthree.ui.TopicThreeActivity
import com.stammer.app.modules.topictwo.ui.TopicTwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearTOPICFive.setOnClickListener {
      val destIntent = TopicFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTOPICThree.setOnClickListener {
      val destIntent = TopicThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTOPICTwo.setOnClickListener {
      val destIntent = TopicTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHOMEPAGE.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCOURSESHOWCASE.setOnClickListener {
      val destIntent = CourseShowcaseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginScreen.setOnClickListener {
      val destIntent = LoginScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTOPICFour.setOnClickListener {
      val destIntent = TopicFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogIn.setOnClickListener {
      val destIntent = LogInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailedProfile.setOnClickListener {
      val destIntent = DetailedProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTOPICOne.setOnClickListener {
      val destIntent = TopicOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCoursePage.setOnClickListener {
      val destIntent = CoursePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
