package com.saico.prtfoliommp.feature.resumeScreen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.saico.prtfoliommp.model.Resume
import com.saico.prtfoliommp.model.SkillsData
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.experience
import portfolio.composeapp.generated.resources.others_skills
import portfolio.composeapp.generated.resources.skills
import portfolio.composeapp.generated.resources.soft_skills
import portfolio.composeapp.generated.resources.top_skills

@Composable
fun Skills(resume: Resume, windowSizeClass: WindowSizeClass) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
            text = stringResource(Res.string.skills),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = MaterialTheme.typography.titleLarge.fontSize
        )
    }

    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactSkills(resume = resume)
        WindowSizeClass.Medium -> ExtendSkills(resume = resume)
        WindowSizeClass.Expanded -> ExtendSkills(resume = resume)
    }
}

@Composable
fun ExtendSkills(resume: Resume) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            SkillsCard(listSkills = resume.topSkills, title = Res.string.top_skills)
            SkillsCard(listSkills = resume.otherSkills, title = Res.string.others_skills)
//            TopSkillsCard(resume = resume)
//            OtherSkillsCard(resume = resume)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            SkillsCard(listSkills = resume.softSkills, title = Res.string.soft_skills)
//            SoftSkillsCard(resume = resume)
        }
    }
}

@Composable
fun CompactSkills(resume: Resume) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkillsCard(listSkills = resume.topSkills, title = Res.string.top_skills)
        SkillsCard(listSkills = resume.otherSkills, title = Res.string.others_skills)
        SkillsCard(listSkills = resume.softSkills, title = Res.string.soft_skills)
    }

}

@Composable
fun SkillsCard(listSkills: List<SkillsData>, title: StringResource) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(12.dp))
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = stringResource(title),
            color = Color.White,
            fontWeight = FontWeight.ExtraBold
        )
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp)
                .height(225.dp),
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalArrangement = Arrangement.Center
        ) {
            items(listSkills) { skill ->

                Row(
                    modifier = Modifier
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                            .padding(8.dp)
                            .size(25.dp)
                            .clip(RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(skill.image),
                        contentDescription = null,
                    )
                    Text(
                        modifier = Modifier
                            .padding(8.dp),
                        text = stringResource(skill.skill),
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
