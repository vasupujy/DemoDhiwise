package com.demoapp.app.modules.onboardingactivity.`data`.model

import com.demoapp.app.R
import com.demoapp.app.appcomponents.di.MyApp
import kotlin.String

public data class ImageSliderGroup3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtImSuperFast: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_i_m_super_fast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMadeToRockYo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_made_to_rock_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrevious: String? = MyApp.getInstance().resources.getString(R.string.lbl_previous)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageBackgroundimag: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageLefticon: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var imageRightIcon: String? = ""

)
