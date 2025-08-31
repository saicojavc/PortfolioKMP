package com.saico.prtfoliommp.feature.homeScreen

import androidx.compose.runtime.Composable
import com.saico.prtfoliommp.feature.homeScreen.screenSizes.CompactHomeScreen
import com.saico.prtfoliommp.feature.homeScreen.screenSizes.ExpandedHomeScreen
import com.saico.prtfoliommp.util.Screen // Import Screen
import com.saico.prtfoliommp.util.WindowSizeClass // Added import

@Composable
fun HomeScreen(
    onScreenSelected: (Screen) -> Unit,
    windowSizeClass: WindowSizeClass
) { // Add windowSizeClass

    Content(
        onScreenSelected = onScreenSelected,
        windowSizeClass = windowSizeClass
    ) // Pass windowSizeClass
}

@Composable
fun Content(
    onScreenSelected: (Screen) -> Unit,
    windowSizeClass: WindowSizeClass
) { // Add windowSizeClass

   when(windowSizeClass){
       WindowSizeClass.Compact -> CompactHomeScreen(onScreenSelected = onScreenSelected, windowSizeClass = windowSizeClass)
       WindowSizeClass.Medium -> ExpandedHomeScreen(onScreenSelected = onScreenSelected, windowSizeClass = windowSizeClass)
       WindowSizeClass.Expanded -> ExpandedHomeScreen(onScreenSelected = onScreenSelected, windowSizeClass = windowSizeClass)
   }
}



