package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Screen Recorder Pro", appName)
  }

  @Test
  fun `verify standard resolution presets`() {
    val resolutions = com.example.data.STANDARD_RESOLUTIONS
    val uhd = resolutions.find { it.name == "4K UHD" }
    assertEquals(3840, uhd?.width)
    assertEquals(2160, uhd?.height)
  }
}
