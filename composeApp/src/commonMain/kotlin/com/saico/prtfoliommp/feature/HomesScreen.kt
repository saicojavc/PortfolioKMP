package com.saico.prtfoliommp.feature

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import androidx.compose.ui.input.pointer.PointerIcon // Importa PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon // Importa pointerHoverIcon
import portfolio.composeapp.generated.resources.desk6

@Composable
fun HomeScreen() {

    Content()

}

@Composable
fun Content() {

    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        ConstraintLayout {
            val (backgroundImage, information) = createRefs()

            Image(

                modifier = Modifier
                    .fillMaxSize()
                    .constrainAs(backgroundImage) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    },
                contentScale = ContentScale.Crop,
                painter = painterResource(Res.drawable.desk6),
                contentDescription = null
            )

            Column(
                modifier = Modifier
                    .padding(start = 92.dp)
                    .fillMaxWidth()
                    .constrainAs(information) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                Text(
                    text = "Jorge A.",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 45.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "Valdes",
                    color = Color.White,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    fontSize = 60.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "Android Developer",
                    color = Color.White,
                    fontSize = 35.sp,
                    fontStyle = FontStyle.Italic
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .pointerHoverIcon(PointerIcon.Hand),
                        border = BorderStroke(1.dp, Color.White),
                        onClick = {

                        },
                        content = {
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 4.dp, horizontal = 18.dp),
                                fontWeight = FontWeight.Bold,
                                text = "Resume",
                                color = Color.White
                            )
                        }
                    )
                    TextButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .pointerHoverIcon(PointerIcon.Hand),
                        border = BorderStroke(1.dp, Color.White),
                        onClick = {

                        },
                        content = {
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 4.dp, horizontal = 18.dp),
                                fontWeight = FontWeight.Bold,
                                text = "Portfolio",
                                color = Color.White
                            )
                        }
                    )
                }
            }
        }
    }
}