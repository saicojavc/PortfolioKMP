package com.saico.prtfoliommp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.saico.prtfoliommp.components.BottomBar
import com.saico.prtfoliommp.components.TopBar
import com.saico.prtfoliommp.feature.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {

        Scaffold(
            modifier = Modifier
//                .background(MaterialTheme.colorScheme.primaryContainer)
                .background(color = Color.Black)
                .safeContentPadding()
                .fillMaxSize(),
            topBar = {
                TopBar()
            },
            bottomBar = {
                BottomBar()
            }
        ) { paddingValues ->
            HomeScreen()
        }

    }
}

