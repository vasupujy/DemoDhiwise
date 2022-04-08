package com.demoapp.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.demoapp.app.R
import com.demoapp.app.appcomponents.base.BaseActivity
import com.demoapp.app.databinding.ActivityAppNavigationBinding
import com.demoapp.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.demoapp.app.modules.onboardingactivity.ui.OnboardingactivityActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearOnBoardingActivity.setOnClickListener {
      val destIntent = OnboardingactivityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
