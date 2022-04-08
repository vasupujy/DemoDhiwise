package com.demoapp.app.modules.onboardingactivity.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demoapp.app.R
import com.demoapp.app.appcomponents.base.BaseActivity
import com.demoapp.app.databinding.ActivityOnboardingactivityBinding
import com.demoapp.app.modules.onboardingactivity.`data`.model.ImageSliderGroup3Model
import com.demoapp.app.modules.onboardingactivity.`data`.viewmodel.OnboardingactivityVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class OnboardingactivityActivity :
    BaseActivity<ActivityOnboardingactivityBinding>(R.layout.activity_onboardingactivity) {
  private val imageSliderGroup3Items: ArrayList<ImageSliderGroup3Model> = arrayListOf()

  private val viewModel: OnboardingactivityVM by viewModels<OnboardingactivityVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val imageSliderGroup3Adapter = ImageSliderGroup3Adapter(imageSliderGroup3Items,true)
    binding.imageSliderGroup3.adapter = imageSliderGroup3Adapter
    binding.imageSliderGroup3.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup1.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup1.updateIndicatorCounts(binding.imageSliderGroup3.indicatorCount)
    binding.onboardingactivityVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup3.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup3.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "ONBOARDINGACTIVITY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingactivityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
