package com.saico.prtfoliommp.feature.portfolioScreen.screenSize

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.my_projects

@Composable
fun ExtendPortfolioScreen(windowSizeClass: WindowSizeClass) {

    val listOfProjects = listOfProjects

    ContentExtendPortfolioScreen(
        listOfProjects = listOfProjects,
        windowSizeClass = windowSizeClass
    )

}

@Composable
fun ContentExtendPortfolioScreen(
    listOfProjects: List<Project>,
    windowSizeClass: WindowSizeClass
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 36.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 64.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(12.dp),
                text = stringResource(resource = Res.string.my_projects),
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 32.sp
            )
            LazyVerticalGrid(
                columns = if (windowSizeClass == WindowSizeClass.Expanded) GridCells.Fixed(3) else GridCells.Fixed(
                    2
                ),
                modifier = if (windowSizeClass == WindowSizeClass.Expanded) Modifier.fillMaxWidth(
                    .7f
                ).padding(8.dp) else Modifier.fillMaxWidth(.8f).padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalArrangement = Arrangement.Center
            ) {
                items(listOfProjects.size) { index ->

                    ProjectCard(project = listOfProjects[index])
                }
            }
        }
    }
}


