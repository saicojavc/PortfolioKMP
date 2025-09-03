package com.saico.prtfoliommp.feature.resumeScreen

import androidx.compose.runtime.Composable
import com.saico.prtfoliommp.feature.resumeScreen.sizeScreen.CompactResumeScreen
import com.saico.prtfoliommp.feature.resumeScreen.sizeScreen.ExpandedResumeScreen
import com.saico.prtfoliommp.util.WindowSizeClass

@Composable
fun ResumeScreen(windowSizeClass: WindowSizeClass) {
    ContentResumeScreen(windowSizeClass = windowSizeClass)
}

@Composable
fun ContentResumeScreen(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactResumeScreen()
        WindowSizeClass.Medium -> ExpandedResumeScreen()
        WindowSizeClass.Expanded -> ExpandedResumeScreen()
    }

}