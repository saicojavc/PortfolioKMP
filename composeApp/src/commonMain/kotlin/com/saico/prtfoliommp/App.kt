package com.saico.prtfoliommp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
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
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.saico.prtfoliommp.components.DrawerContent
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.menuIcon

@Composable
@Preview
fun App() {
    MaterialTheme {

        var currentScreen by remember { mutableStateOf(Screen.Home) }
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        BoxWithConstraints(modifier = Modifier) { // Added BoxWithConstraints

            val windowSizeClass = calculateWindowSizeClass(maxWidth)
            val scaffoldComposable: @Composable () -> Unit = {

                Scaffold(
                    modifier = Modifier
                        .background(color = Color.Black)
                        .fillMaxSize(),
                    topBar = {
                        if (windowSizeClass == WindowSizeClass.Expanded || windowSizeClass == WindowSizeClass.Medium) {
                            TopBar(
                                currentScreen = currentScreen,
                                onScreenSelected = { screen -> currentScreen = screen }
                            )
                        } else {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(
                                    onClick = {
                                        scope.launch {
                                            drawerState.open()
                                        }
                                    }
                                ) {
                                    Image(
                                        modifier = Modifier
                                            .size(28.dp)
                                            .clip(shape = CircleShape),
                                        painter = painterResource(Res.drawable.menuIcon),
                                        contentDescription = "Menu",
                                    )
                                }
                            }

                        }
                    },
                    bottomBar = {
                            BottomBar(windowSizeClass = windowSizeClass)
                    }
                ) { paddingValues ->

                    when (currentScreen) {
                        Screen.Home -> HomeScreen(
                            onScreenSelected = { screen -> currentScreen = screen },
                            windowSizeClass = windowSizeClass
                        )

                        Screen.About -> AboutScreen() // Needs to be adapted
                        Screen.Resume -> ResumeScreen() // Needs to be adapted
                        Screen.Portfolio -> PortfolioScreen() // Needs to be adapted
                    }
                }
            }
            if (windowSizeClass == WindowSizeClass.Compact) {
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        DrawerContent(
                            currentScreen = currentScreen,
                            onScreenSelected = { screen -> currentScreen = screen },
                            drawerState = drawerState,
                            scope = scope,
                        )
                    }
                ) {
                    scaffoldComposable()
                }
            } else {
                scaffoldComposable()
            }

        }
    }
}

