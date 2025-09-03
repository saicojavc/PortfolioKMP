package com.saico.prtfoliommp.feature.resumeScreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Skills() {
    val skillsList = listOf(
        "Kotlin",
        "Jetpack Compose",
        "UI/UX",
        "Retrofit",
        "Room Database",
        "Gradle",
        "Android Studio",
        "Kotlin Multiplatform",
        "Compose Multiplatform"
    )
    LazyColumn {
        item {
            Text(
                text = "Skills",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        items(skillsList) { skill ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(color = Color.Black, shape = CircleShape)
                        .border(1.dp, Color.White, shape = CircleShape)
                ) {
                    Text(
                        text = (skillsList.indexOf(skill) + 1).toString(),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                    )
                }
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = skill,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                )
            }
            if (skillsList.indexOf(skill) != skillsList.lastIndex) {
                VerticalDivider(
                    modifier = Modifier
                        .padding(start = 28.dp)
                        .height(24.dp)
                        .width(1.dp),
                )
            }

        }
    }
}