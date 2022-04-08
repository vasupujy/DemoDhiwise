package com.demoapp.app.modules.onboardingactivity.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.demoapp.app.databinding.SlideritemOnboardingactivity1Binding
import com.demoapp.app.modules.onboardingactivity.`data`.model.ImageSliderGroup3Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup3Adapter(
  public val dataList: ArrayList<ImageSliderGroup3Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup3Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemOnboardingactivity1Binding) {
      binding.imageSliderGroup3Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingactivity1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
