package com.saico.prtfoliommp.feature.resumeScreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.eyeIcon
import portfolio.composeapp.generated.resources.titulo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Education(resume: Resume, windowSizeClass: WindowSizeClass) {

    val uriHandler = LocalUriHandler.current
    var show by remember { mutableStateOf(false) }

    if (show) {
        AlertDialog(
            onDismissRequest = { show = false },
            content = {
                Image(
                    modifier = Modifier.padding(8.dp),
                    painter = painterResource(Res.drawable.titulo),
                    contentDescription = null,
                )
            }
        )
    }

    LazyColumn(
        modifier = Modifier
            .height(610.dp)
    ) {
        item {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Education and Certification",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
        items(resume.educationList) { education ->

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
                        text = (resume.educationList.indexOf(education) + 1).toString(),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            if (education.haveCertification) {
                                education.certificationURL?.let { uriHandler.openUri(it) }
                            } else {
                                show = true
                            }
                        },
                    text = education.name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                )

                if (windowSizeClass == WindowSizeClass.Expanded) {
                    IconButton(
                        onClick = {
                            if (education.haveCertification) {
                                education.certificationURL?.let { uriHandler.openUri(it) }
                            } else {
                                show = true
                            }
                        },
                    ) {
                        Image(
                            modifier = Modifier,
                            painter = painterResource(Res.drawable.eyeIcon),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }

                }

            }
            if (resume.educationList.indexOf(education) != resume.educationList.lastIndex) {
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