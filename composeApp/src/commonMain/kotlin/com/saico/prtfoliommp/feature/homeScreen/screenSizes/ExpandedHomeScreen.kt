package com.saico.prtfoliommp.feature.homeScreen.screenSizes

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
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.saico.prtfoliommp.util.Screen
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.desk6
import portfolio.composeapp.generated.resources.first_name_jorge
import portfolio.composeapp.generated.resources.last_name_valdes
import portfolio.composeapp.generated.resources.portfolio
import portfolio.composeapp.generated.resources.resume
import portfolio.composeapp.generated.resources.title_android_developer
import portfolio.composeapp.generated.resources.walla1

@Composable
fun ExpandedHomeScreen(
    onScreenSelected: (Screen) -> Unit,
    windowSizeClass: WindowSizeClass
){

    ExtendedContent(
        onScreenSelected = onScreenSelected,
        windowSizeClass = windowSizeClass
        )

}

@Composable
fun ExtendedContent(
    onScreenSelected: (Screen) -> Unit,
    windowSizeClass: WindowSizeClass
){
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
                painter = painterResource(Res.drawable.walla1),
                contentDescription = null
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(information) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    },
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(Res.string.first_name_jorge),
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 45.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = stringResource(Res.string.last_name_valdes),
                    color = Color.White,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Black,
                    fontSize = 60.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = stringResource(Res.string.title_android_developer),
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
                            onScreenSelected(Screen.Resume) // Navigate to Resume
                        },
                        content = {
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 4.dp, horizontal = 18.dp),
                                fontWeight = FontWeight.Bold,
                                text = stringResource(Res.string.resume),
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
                            onScreenSelected(Screen.Portfolio) // Navigate to Portfolio
                        },
                        content = {
                            Text(
                                modifier = Modifier
                                    .padding(vertical = 4.dp, horizontal = 18.dp),
                                fontWeight = FontWeight.Bold,
                                text = stringResource(Res.string.portfolio),
                                color = Color.White
                            )
                        }
                    )
                }
            }
        }
    }
}

