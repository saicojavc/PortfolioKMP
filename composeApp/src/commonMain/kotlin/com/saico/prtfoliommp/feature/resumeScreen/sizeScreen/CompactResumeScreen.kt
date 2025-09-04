package com.saico.prtfoliommp.feature.resumeScreen.sizeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.saico.prtfoliommp.feature.resumeScreen.component.Education
import com.saico.prtfoliommp.feature.resumeScreen.component.Experience
import com.saico.prtfoliommp.feature.resumeScreen.component.Skills
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.desk8

@Composable
fun CompactResumeScreen(resume: Resume, windowSizeClass: WindowSizeClass) {
    ContentCompactResumeScreen(resume = resume, windowSizeClass = windowSizeClass)
}


@Composable
fun ContentCompactResumeScreen(resume: Resume, windowSizeClass: WindowSizeClass) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (backgroundImage, contentColumn) = createRefs()

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
                .padding(vertical = 78.dp)
                .height(3400.dp)
                .constrainAs(contentColumn) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
                .padding(16.dp)
        ) {
            item {
                Skills(resume = resume)
            }
            item {
                Education(resume = resume, windowSizeClass = windowSizeClass)
            }
            item {
                Experience(resume = resume)
            }
        }
    }
}
