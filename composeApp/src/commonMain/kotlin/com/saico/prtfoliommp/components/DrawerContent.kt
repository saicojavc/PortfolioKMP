package com.saico.prtfoliommp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.saico.prtfoliommp.util.Screen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    currentScreen: Screen,
    onScreenSelected: (Screen) -> Unit,
    drawerState: DrawerState,
    scope: CoroutineScope
) {

    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = .85f)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {
                onScreenSelected(Screen.Home)
                scope.launch {
                    drawerState.close()
                }
            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    text = "Home",
                    color = if (currentScreen == Screen.Home) Color.Gray else Color.White,
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {
                onScreenSelected(Screen.About)
                scope.launch {
                    drawerState.close()
                }
            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "About",
                    color = if (currentScreen == Screen.About) Color.Gray else Color.White
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {
                onScreenSelected(Screen.Resume)
                scope.launch {
                    drawerState.close()
                }
            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Resume",
                    color = if (currentScreen == Screen.Resume) Color.Gray else Color.White
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {
                onScreenSelected(Screen.Portfolio)
                scope.launch {
                    drawerState.close()
                }
            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Portfolio",
                    color = if (currentScreen == Screen.Portfolio) Color.Gray else Color.White
                )
            }
        )
    }

}