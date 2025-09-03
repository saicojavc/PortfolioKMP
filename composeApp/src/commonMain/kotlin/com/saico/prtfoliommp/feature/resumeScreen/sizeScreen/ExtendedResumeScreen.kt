package com.saico.prtfoliommp.feature.resumeScreen.sizeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.saico.prtfoliommp.feature.resumeScreen.component.Education
import com.saico.prtfoliommp.feature.resumeScreen.component.Experience
import com.saico.prtfoliommp.feature.resumeScreen.component.Skills
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

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (backgroundImage, content) = createRefs()

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
        Row(
            modifier = Modifier
                .padding(vertical = 74.dp, horizontal = 38.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Skills()
            Education()
            Experience()
        }

    }
}