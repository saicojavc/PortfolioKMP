package com.saico.prtfoliommp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.saico.prtfoliommp.components.BottomBar
import com.saico.prtfoliommp.components.TopBar
import com.saico.prtfoliommp.feature.HomeScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform
import portfolio.composeapp.generated.resources.desk
import portfolio.composeapp.generated.resources.desk2
import portfolio.composeapp.generated.resources.desk3
import portfolio.composeapp.generated.resources.desk4
import portfolio.composeapp.generated.resources.desk5

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

