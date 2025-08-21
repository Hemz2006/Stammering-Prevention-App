package com.stammer.app.modules.appnavigation.`data`.model

import com.stammer.app.R
import com.stammer.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplash: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginScreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailedProfile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_detailed_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHOMEPAGE: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCOURSESHOWCASE: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_course_showcase)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoursePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_course_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOPICOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_topic_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOPICTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_topic_two)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOPICThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_topic_three)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOPICFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_topic_four)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOPICFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_topic_five)

)
