package com.saico.prtfoliommp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.saico.prtfoliommp.components.BottomBar
import com.saico.prtfoliommp.components.TopBar
import com.saico.prtfoliommp.feature.AboutScreen
import com.saico.prtfoliommp.feature.HomeScreen
import com.saico.prtfoliommp.feature.PortfolioScreen
import com.saico.prtfoliommp.feature.ResumeScreen
import com.saico.prtfoliommp.model.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var currentScreen by remember { mutableStateOf(Screen.Home) }

        Scaffold(
            modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize(),
            topBar = {
                TopBar(
                    currentScreen = currentScreen,
                    onScreenSelected = { screen -> currentScreen = screen }
                )
            },
            bottomBar = {
                BottomBar()
            }
        ) { paddingValues ->
            when (currentScreen) {
                Screen.Home -> HomeScreen(onScreenSelected = { screen ->
                    currentScreen = screen
                }) // Pass lambda
                Screen.About -> AboutScreen()
                Screen.Resume -> ResumeScreen()
                Screen.Portfolio -> PortfolioScreen()
            }
        }
    }
}
