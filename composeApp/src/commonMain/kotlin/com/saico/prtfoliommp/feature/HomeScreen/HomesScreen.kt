package com.saico.prtfoliommp.feature.homeScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.saico.prtfoliommp.feature.HomeScreen.screenSizes.CompactHomeScreen
import com.saico.prtfoliommp.feature.HomeScreen.screenSizes.ExpandedHomeScreen
import com.saico.prtfoliommp.util.Screen // Import Screen
import com.saico.prtfoliommp.util.WindowSizeClass // Added import
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.desk6

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
       WindowSizeClass.Compact -> CompactHomeScreen()
       WindowSizeClass.Medium -> ExpandedHomeScreen(onScreenSelected = onScreenSelected, windowSizeClass = windowSizeClass)
       WindowSizeClass.Expanded -> ExpandedHomeScreen(onScreenSelected = onScreenSelected, windowSizeClass = windowSizeClass)
   }
}



