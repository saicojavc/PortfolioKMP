package com.saico.prtfoliommp.feature.aboutScreen.screenSizes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun ExpandedAboutScreen() {

    ContentExpandedAboutScreen()

}

@Composable
fun ContentExpandedAboutScreen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val (info) = createRefs()

            Row(
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .padding(18.dp)
                    .constrainAs(info) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    modifier = Modifier.weight(1f),
                    text = "\n" +
                            "Computer Engineer specialized in android development with experience" +
                            "building native android applications using Kotlin and Jetpack Compose " +
                            "and with strong focus on UI/UX best practice. Skilled in implementing MVVM architecture," +
                            " Room Database and integration RESTfull API using Retrofit.",
                    color = Color.White
                )

                Image(
                    modifier = Modifier
                        .size(350.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(Res.drawable.me),
                    contentDescription = null,

                    )

//                AsyncImage(
//                    model =  "https://res.cloudinary.com/ds4ko1uws/image/upload/v1756578749/me_dbrl4f.jpg",
//                    contentDescription = null,
//                    modifier = Modifier.size(350.dp).clip(shape = CircleShape),
//                    contentScale = ContentScale.Crop
//                )


            }
        }
    }
}
