package com.saico.prtfoliommp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.saico.prtfoliommp.components.BottomBar
import com.saico.prtfoliommp.components.TopBar
import com.saico.prtfoliommp.feature.AboutScreen
import com.saico.prtfoliommp.feature.homeScreen.HomeScreen
import com.saico.prtfoliommp.feature.PortfolioScreen
import com.saico.prtfoliommp.feature.ResumeScreen
import com.saico.prtfoliommp.util.Screen
import com.saico.prtfoliommp.util.WindowSizeClass
import com.saico.prtfoliommp.util.calculateWindowSizeClass // Added import
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var currentScreen by remember { mutableStateOf(Screen.Home) }
        BoxWithConstraints(modifier = Modifier) { // Added BoxWithConstraints
            val windowSizeClass = calculateWindowSizeClass(maxWidth)
            Scaffold(
                modifier = Modifier
                    .background(color = Color.Black)
                    .fillMaxSize(),
                topBar = {
                    if (windowSizeClass == WindowSizeClass.Expanded || windowSizeClass == WindowSizeClass.Medium){
                        TopBar(
                            currentScreen = currentScreen,
                            onScreenSelected = { screen -> currentScreen = screen }
                        )
                    }

                },
                bottomBar = {
                    if (windowSizeClass == WindowSizeClass.Expanded || windowSizeClass == WindowSizeClass.Medium){
                        BottomBar()
                    }

                }
            ) { paddingValues ->

                when (currentScreen) {
                    Screen.Home -> HomeScreen(
                        onScreenSelected = { screen -> currentScreen = screen },
                        windowSizeClass = windowSizeClass // Pass windowSizeClass
                    )

                    Screen.About -> AboutScreen() // Needs to be adapted
                    Screen.Resume -> ResumeScreen() // Needs to be adapted
                    Screen.Portfolio -> PortfolioScreen() // Needs to be adapted
                }
            }
        }
    }
}
