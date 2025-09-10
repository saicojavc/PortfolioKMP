package com.saico.prtfoliommp.feature.resumeScreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.experience


@Composable
fun Experience(resume: Resume, windowSizeClass: WindowSizeClass) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
            text = stringResource(Res.string.experience),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = MaterialTheme.typography.titleLarge.fontSize
        )

        resume.experienceList.forEach { experience ->
            ConstraintLayout(
                modifier = Modifier.fillMaxWidth()
            ) {
                val (image, experiences, companyName, typeJob, date) = createRefs()
                Image(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                        .size(50.dp)
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                        },
                    contentScale = ContentScale.Crop,
                    painter = painterResource(experience.image),
                    contentDescription = null

                )
                Text(
                    modifier = Modifier
                        .padding(8.dp)
                        .constrainAs(experiences) {
                            top.linkTo(parent.top)
                            start.linkTo(image.end)
                        },
                    text = stringResource(experience.experience),
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    modifier = Modifier
                        .padding(8.dp)
                        .constrainAs(companyName) {
                            top.linkTo(experiences.bottom)
                            bottom.linkTo(typeJob.top)
                            start.linkTo(image.end)
                        },
                    text = stringResource(experience.companyName),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    modifier = Modifier
                        .padding(8.dp)
                        .constrainAs(typeJob) {
                            top.linkTo(companyName.bottom)
                            start.linkTo(image.end)
                        },
                    text = stringResource(experience.typeJob),
                    color = Color.Gray,
                )
                if (windowSizeClass == WindowSizeClass.Compact){
                    Text(
                        modifier = Modifier
                            .padding(8.dp)
                            .constrainAs(date) {
                                top.linkTo(experiences.top)
                                start.linkTo(image.end)
                                bottom.linkTo(companyName.bottom)
                            },
                        text = stringResource(experience.date),
                        color = Color.Gray,
                    )
                }else{
                    Text(
                        modifier = Modifier
                            .padding(8.dp)
                            .constrainAs(date) {
                                top.linkTo(parent.top)
                                end.linkTo(parent.end)
                            },
                        text = stringResource(experience.date),
                        color = Color.Gray,
                    )

                }

            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Gray)

            )
        }

    }
}
