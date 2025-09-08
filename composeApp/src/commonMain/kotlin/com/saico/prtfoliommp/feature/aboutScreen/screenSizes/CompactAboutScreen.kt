package com.saico.prtfoliommp.feature.aboutScreen.screenSizes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.constraintlayout.compose.ConstraintLayout
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
                .padding(horizontal = 8.dp, vertical = 8.dp)
        ) {
            val (info) = createRefs()
            LazyColumn(
                modifier = Modifier
                    .padding(horizontal =  8.dp, vertical = 72.dp)
                    .constrainAs(info) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
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
                        modifier = Modifier.padding(8.dp),
                        text = stringResource(Res.string.about_me_description),
                        color = Color.White
                    )
                    ElevatedCard(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Black),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.Start
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
                                modifier = Modifier.padding(24.dp),
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
            }
        }
    }
}