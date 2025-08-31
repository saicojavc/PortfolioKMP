package com.saico.prtfoliommp.feature.aboutScreen

import androidx.compose.runtime.Composable
import com.saico.prtfoliommp.feature.aboutScreen.screenSizes.CompactAboutScreen
import com.saico.prtfoliommp.feature.aboutScreen.screenSizes.ExpandedAboutScreen
import com.saico.prtfoliommp.util.WindowSizeClass

@Composable
fun AboutScreen(windowSizeClass: WindowSizeClass) {

    AboutContent(windowSizeClass = windowSizeClass)
}


@Composable
fun AboutContent(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactAboutScreen()
        WindowSizeClass.Medium -> ExpandedAboutScreen()
        WindowSizeClass.Expanded -> ExpandedAboutScreen()
    }
}