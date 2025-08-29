package com.saico.prtfoliommp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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

@Composable
fun TopBar(currentScreen: Screen, onScreenSelected: (Screen) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = { onScreenSelected(Screen.Home) },
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
            onClick = { onScreenSelected(Screen.About) },
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
            onClick = { onScreenSelected(Screen.Resume) },
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
            onClick = { onScreenSelected(Screen.Portfolio) },
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