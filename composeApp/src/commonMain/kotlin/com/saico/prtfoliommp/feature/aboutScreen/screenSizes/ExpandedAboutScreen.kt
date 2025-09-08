package com.saico.prtfoliommp.feature.aboutScreen.screenSizes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.about_me_description
import portfolio.composeapp.generated.resources.available
import portfolio.composeapp.generated.resources.computer_engineering
import portfolio.composeapp.generated.resources.education
import portfolio.composeapp.generated.resources.florida
import portfolio.composeapp.generated.resources.location
import portfolio.composeapp.generated.resources.me
import portfolio.composeapp.generated.resources.university


@Composable
fun ExpandedAboutScreen() {

    ContentExpandedAboutScreen()

}

@Composable
fun ContentExpandedAboutScreen() {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 56.dp, horizontal = 24.dp)
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(
                modifier = Modifier
                    .weight(2f).padding(8.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.widthIn(max = 550.dp),
                    text = stringResource(Res.string.about_me_description),
                    color = Color.White
                )
                ElevatedCard(
                    modifier = Modifier
                        .padding(top = 18.dp)
                        .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .background(Color.Black),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier.padding(24.dp),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = stringResource(Res.string.education),
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Text(
                                text = stringResource(Res.string.computer_engineering),
                                color = Color.Gray
                            )
                            Text(
                                text = stringResource(Res.string.university),
                                color = Color.Gray,
                            )

                        }
                        Column(
                            modifier = Modifier.padding(18.dp),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = stringResource(Res.string.location),
                                color = Color.White,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Text(
                                text = stringResource(Res.string.florida),
                                color = Color.Gray
                            )
                            Text(
                                text = stringResource(Res.string.available),
                                color = Color.Gray,
                            )

                        }
                    }

                }
            }

            Box(modifier = Modifier.weight(1f).padding(12.dp)) {
                Image(
                    modifier = Modifier
                        .size(300.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(Res.drawable.me),
                    contentDescription = null,

                    )
            }


//                AsyncImage(
//                    model =  "https://res.cloudinary.com/ds4ko1uws/image/upload/v1756578749/me_dbrl4f.jpg",
//                    contentDescription = null,
//                    modifier = Modifier.size(350.dp).clip(shape = CircleShape),
//                    contentScale = ContentScale.Crop
//                )

        }
    }
}