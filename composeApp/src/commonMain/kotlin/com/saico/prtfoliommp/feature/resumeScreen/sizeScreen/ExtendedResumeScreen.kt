package com.saico.prtfoliommp.feature.resumeScreen.sizeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.desk6
import portfolio.composeapp.generated.resources.desk8
import portfolio.composeapp.generated.resources.eyeIcon

@Composable
fun ExpandedResumeScreen() {
    ContentExpandedResumeScreen()
}

@Composable
fun ContentExpandedResumeScreen() {

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

    val listOfEducation = listOf(
        "Computer Engineering at Central University of Las Villas ",
        "Create the User Interface in Android Studio",
        "Advanced Programming in Kotlin",
        "Working with Data in Android",
        "Version Control",
        "Principles of UX/UI Design",
        "Foundations of User Experience (UX) Design"
    )

    val listOfExperience = listOf(
        "Android Developer in XETID"," Android Developer in Upwork"
    )

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (backgroundImage, skills, education, experience) = createRefs()

        Image(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
                .alpha(0.3f)
                .constrainAs(backgroundImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },
            contentScale = ContentScale.Crop,
            painter = painterResource(Res.drawable.desk8),
            contentDescription = null
        )
        LazyColumn(
            modifier = Modifier
                .padding(top = 62.dp, start = 24.dp, bottom = 74.dp)
                .constrainAs(skills) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                }
        ) {
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

        LazyColumn(
            modifier = Modifier
                .padding(top = 62.dp, bottom = 74.dp)
                .constrainAs(education) {
                    top.linkTo(parent.top)
                    start.linkTo(skills.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }

        ) {
            item {
                Text(
                    text = "Education and Certification",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            items(listOfEducation) { education ->

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
                            text = (listOfEducation.indexOf(education) + 1).toString(),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                        )
                    }
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = education,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                    )
                    IconButton(
                        onClick = { /*TODO*/ },
                    ){
                        Image(
                            modifier = Modifier,
                            painter = painterResource(Res.drawable.eyeIcon),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                if (listOfEducation.indexOf(education) != listOfEducation.lastIndex) {
                    VerticalDivider(
                        modifier = Modifier
                            .padding(start = 28.dp)
                            .height(24.dp)
                            .width(1.dp),
                    )
                }


            }
        }
        LazyColumn(
            modifier = Modifier
                .padding(top = 62.dp, end = 24.dp)
                .constrainAs(experience) {
                    top.linkTo(parent.top)
//                    start.linkTo(education.start)
                    end.linkTo(parent.end)
//                    bottom.linkTo(parent.bottom)
                }

        ) {
            item {
                Text(
                    text = "Experience",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            items(listOfExperience) { experience ->
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
                            text = (listOfExperience.indexOf(experience) + 1).toString(),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                        )
                    }
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = experience,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                    )
                }
                if (listOfExperience.indexOf(experience) != listOfExperience.lastIndex) {
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
}