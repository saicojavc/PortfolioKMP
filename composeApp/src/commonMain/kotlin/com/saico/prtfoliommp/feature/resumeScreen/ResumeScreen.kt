package com.saico.prtfoliommp.feature.resumeScreen

import androidx.compose.runtime.Composable
import com.saico.prtfoliommp.feature.resumeScreen.sizeScreen.CompactResumeScreen
import com.saico.prtfoliommp.feature.resumeScreen.sizeScreen.ExpandedResumeScreen
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.util.WindowSizeClass

@Composable
fun ResumeScreen(windowSizeClass: WindowSizeClass) {
    val resume = Resume()
    ContentResumeScreen(windowSizeClass = windowSizeClass, resume = resume)
}

@Composable
fun ContentResumeScreen(windowSizeClass: WindowSizeClass, resume: Resume) {
    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactResumeScreen( resume = resume, windowSizeClass =windowSizeClass)
        WindowSizeClass.Medium -> ExpandedResumeScreen( resume = resume,windowSizeClass =windowSizeClass)
        WindowSizeClass.Expanded -> ExpandedResumeScreen( resume = resume,windowSizeClass =windowSizeClass)
    }

}