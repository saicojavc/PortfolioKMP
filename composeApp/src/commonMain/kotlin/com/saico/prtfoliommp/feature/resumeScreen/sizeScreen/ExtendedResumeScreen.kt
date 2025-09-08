package com.saico.prtfoliommp.feature.resumeScreen.sizeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.saico.prtfoliommp.feature.resumeScreen.component.Experience
import com.saico.prtfoliommp.feature.resumeScreen.component.Skills
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.desk8
import portfolio.composeapp.generated.resources.walla

@Composable
fun ExpandedResumeScreen(resume: Resume, windowSizeClass: WindowSizeClass) {


    ContentExpandedResumeScreen(resume = resume, windowSizeClass = windowSizeClass)
}

@Composable
fun ContentExpandedResumeScreen(resume: Resume, windowSizeClass: WindowSizeClass) {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (backgroundImage) = createRefs()

        Image(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
                .constrainAs(backgroundImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },
            contentScale = ContentScale.Crop,
            painter = painterResource(Res.drawable.walla),
            contentDescription = null
        )
        Row(
            modifier = Modifier
                .padding(vertical = 74.dp, horizontal = 38.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {

            Skills(resume = resume)
            Experience(resume = resume)
        }

    }
}