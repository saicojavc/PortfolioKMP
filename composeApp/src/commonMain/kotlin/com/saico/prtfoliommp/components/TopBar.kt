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

@Composable
fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {

            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    text = "Home",
                    color = Color.White,
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {

            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "About",
                    color = Color.White
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {

            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Resume",
                    color = Color.White
                )
            }
        )
        TextButton(
            modifier = Modifier
                .padding(16.dp)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = {

            },
            content = {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Portfolio",
                    color = Color.White
                )
            }
        )
    }
}