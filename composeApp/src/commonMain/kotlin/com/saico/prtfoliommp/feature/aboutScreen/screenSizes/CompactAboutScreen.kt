package com.saico.prtfoliommp.feature.aboutScreen.screenSizes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.me

@Composable
fun CompactAboutScreen() {
    ContentCompactAboutScreen()
}

@Composable
fun ContentCompactAboutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp, start = 8.dp, end = 8.dp)
//                .background(color = Color.Black),
//                .background(color = Color.Black)
        ) {
            val (info) = createRefs()
            Column(
                modifier = Modifier
                    .constrainAs(info) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
//                        bottom.linkTo(parent.bottom)
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(Res.drawable.me),
                    contentDescription = null,
                )

//                AsyncImage(
//                    model = "https://res.cloudinary.com/ds4ko1uws/image/upload/v1756578749/me_dbrl4f.jpg",
//                    modifier = Modifier.size(100.dp).clip(shape = CircleShape),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop
//                )
                Text(
                    modifier = Modifier,
                    text = "\n" +
                            "Computer Engineer specialized in android development with experience" +
                            "building native android applications using Kotlin and Jetpack Compose " +
                            "and with strong focus on UI/UX best practice. Skilled in implementing MVVM architecture," +
                            " Room Database and integration RESTfull API using Retrofit.",
                    color = Color.White
                )
            }


        }
    }
}