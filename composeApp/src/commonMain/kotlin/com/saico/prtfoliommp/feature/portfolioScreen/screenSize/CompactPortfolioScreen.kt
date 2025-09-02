package com.saico.prtfoliommp.feature.portfolioScreen.screenSize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saico.prtfoliommp.feature.portfolioScreen.component.ProjectCard
import com.saico.prtfoliommp.model.Project
import com.saico.prtfoliommp.model.listOfProjects
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.my_projects


@Composable
fun CompactPortfolioScreen() {
    val listOfProjects = listOfProjects
    ContentCompactPortfolioScreen(listOfProjects = listOfProjects)
}

@Composable
fun ContentCompactPortfolioScreen(listOfProjects: List<Project>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 36.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 94.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = stringResource(resource =  Res.string.my_projects),
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 32.sp
                )
            }
            items(listOfProjects.size) { index ->
                ProjectCard(project = listOfProjects[index])
            }

        }
    }

}

