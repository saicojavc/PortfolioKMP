package com.saico.prtfoliommp.feature.portfolioScreen.screenSize

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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.p1_airline
import portfolio.composeapp.generated.resources.p2_shop
import portfolio.composeapp.generated.resources.p3_house
import portfolio.composeapp.generated.resources.p4_ticket
import portfolio.composeapp.generated.resources.p5_jit

@Composable
fun ExtendPortfolioScreen(windowSizeClass: WindowSizeClass) {

    val listOfProjects = listOf(
        Res.drawable.p1_airline,
        Res.drawable.p2_shop,
        Res.drawable.p3_house,
        Res.drawable.p4_ticket,
        Res.drawable.p5_jit,
    )

    ContentExtendPortfolioScreen(listOfProjects = listOfProjects, windowSizeClass = windowSizeClass)

}

@Composable
fun ContentExtendPortfolioScreen(
    listOfProjects: List<DrawableResource>,
    windowSizeClass: WindowSizeClass
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
            .padding(top = 42.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 42.dp, bottom = 64.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(12.dp),
                text = "My Projects",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 32.sp
            )
            LazyVerticalGrid(
                columns = if (windowSizeClass == WindowSizeClass.Expanded) GridCells.Fixed(3) else GridCells.Fixed(2),
                modifier = if (windowSizeClass == WindowSizeClass.Expanded) Modifier.fillMaxWidth(.7f).padding(8.dp) else Modifier.fillMaxWidth(.8f).padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalArrangement = Arrangement.Center
            ) {
                items(listOfProjects.size) { index ->

                    ProjectCard(projectImage = listOfProjects[index])
                }
            }
        }
    }
}


@Composable
fun ProjectCard(projectImage: DrawableResource) {
    ElevatedCard(
        modifier = Modifier
            .padding(bottom = 38.dp, start = 12.dp, end = 12.dp)
            .width(180.dp)
            .background(Color.Black, shape = RoundedCornerShape(20.dp))
            .border(1.dp, Color.White, shape = RoundedCornerShape(20.dp))
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.height(280.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(projectImage),
                contentDescription = null,
            )
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
                    .border(1.dp, Color.White, shape = CircleShape)
            ) {
                Text(
                    text = "View Project",
                    color = Color.White
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
                    .border(1.dp, Color.White, shape = CircleShape)
            ) {
                Text(
                    text = "Go to GitHub",
                    color = Color.White
                )
            }
        }
    }
}
