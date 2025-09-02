package com.saico.prtfoliommp.feature.portfolioScreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saico.prtfoliommp.model.Project
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProjectCard(project: Project) {
    ElevatedCard(
        modifier = Modifier
            .padding(bottom = 32.dp, start = 8.dp, end = 8.dp)
            .background(Color.Black, shape = RoundedCornerShape(20.dp))
            .border(1.dp, Color.White, shape = RoundedCornerShape(20.dp))
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.height(280.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(project.projectImage),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding( 8.dp),
                text = project.projectName,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp
            )
            Text(
                modifier = Modifier.padding( 8.dp),
                text = project.description,
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
//            TextButton(
//                onClick = { /*TODO*/ },
//                modifier = Modifier.fillMaxWidth().padding(8.dp)
//                    .border(1.dp, Color.White, shape = CircleShape)
//            ) {
//                Text(
//                    text = "View Project",
//                    color = Color.White
//                )
//            }
            GithubButton(project = project)


        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GithubButton(project: Project) {
    val uriHandler = LocalUriHandler.current
    val tooltipMessage = if (project.hasGithubRepo) {
        "Open repository on GitHub"
    } else {
        "This project is private on GitHub"
    }

    TooltipBox(
        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
        tooltip = {
            PlainTooltip {
                Text(tooltipMessage)
            }
        },
        state = rememberTooltipState(),
        modifier = Modifier.padding(8.dp),

        ) {
        TextButton(
            enabled = project.hasGithubRepo,
            onClick = {
                project.githubRepoUrl?.let { uriHandler.openUri(it) }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp , if (project.hasGithubRepo)Color.White else Color.Gray, shape = CircleShape)
        ) {
            Text(
                text = "Go to GitHub",
                color = if (project.hasGithubRepo)Color.White else Color.Gray
            )
        }
    }
}
