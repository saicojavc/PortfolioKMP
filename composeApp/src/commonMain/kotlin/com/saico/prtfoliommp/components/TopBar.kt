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
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.about
import portfolio.composeapp.generated.resources.home
import portfolio.composeapp.generated.resources.portfolio
import portfolio.composeapp.generated.resources.resume

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
                    text = stringResource(Res.string.home),
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
                    text = stringResource(Res.string.about),
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
                    text = stringResource(Res.string.resume),
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
                    text =stringResource(Res.string.portfolio),
                    color = if (currentScreen == Screen.Portfolio) Color.Gray else Color.White
                )
            }
        )
    }
}