package com.demoapp.app.modules.onboardingactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demoapp.app.modules.onboardingactivity.`data`.model.OnboardingactivityModel
import org.koin.core.KoinComponent

public class OnboardingactivityVM : ViewModel(), KoinComponent {
  public val onboardingactivityModel: MutableLiveData<OnboardingactivityModel> =
      MutableLiveData(OnboardingactivityModel())

  public var navArguments: Bundle? = null
}
