package com.saico.prtfoliommp.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.agile
import portfolio.composeapp.generated.resources.androidstudiologo
import portfolio.composeapp.generated.resources.code
import portfolio.composeapp.generated.resources.collaboration
import portfolio.composeapp.generated.resources.communication
import portfolio.composeapp.generated.resources.comp
import portfolio.composeapp.generated.resources.compose_multiplatform
import portfolio.composeapp.generated.resources.composelogo
import portfolio.composeapp.generated.resources.database
import portfolio.composeapp.generated.resources.date1
import portfolio.composeapp.generated.resources.date2
import portfolio.composeapp.generated.resources.date3
import portfolio.composeapp.generated.resources.firebase
import portfolio.composeapp.generated.resources.freelance
import portfolio.composeapp.generated.resources.git3
import portfolio.composeapp.generated.resources.githab2
import portfolio.composeapp.generated.resources.github
import portfolio.composeapp.generated.resources.gradle
import portfolio.composeapp.generated.resources.hybrid
import portfolio.composeapp.generated.resources.idea
import portfolio.composeapp.generated.resources.in_person
import portfolio.composeapp.generated.resources.intern
import portfolio.composeapp.generated.resources.internet
import portfolio.composeapp.generated.resources.jetpack
import portfolio.composeapp.generated.resources.kotlin
import portfolio.composeapp.generated.resources.kotlin_multiplatform
import portfolio.composeapp.generated.resources.kotlinlogo
import portfolio.composeapp.generated.resources.problems_solving
import portfolio.composeapp.generated.resources.remote
import portfolio.composeapp.generated.resources.responsive_design
import portfolio.composeapp.generated.resources.retrofit
import portfolio.composeapp.generated.resources.room
import portfolio.composeapp.generated.resources.scrumm
import portfolio.composeapp.generated.resources.studio
import portfolio.composeapp.generated.resources.team
import portfolio.composeapp.generated.resources.ui_ux
import portfolio.composeapp.generated.resources.uilogo
import portfolio.composeapp.generated.resources.undraw_building_a_website_1wrp
import portfolio.composeapp.generated.resources.undraw_file_search_cbur
import portfolio.composeapp.generated.resources.undraw_programmer_raqr
import portfolio.composeapp.generated.resources.university
import portfolio.composeapp.generated.resources.upwork
import portfolio.composeapp.generated.resources.windowslogo
import portfolio.composeapp.generated.resources.xetid

data class Resume(
    val topSkills: List<SkillsData> = listOf(
        SkillsData(Res.string.kotlin, Res.drawable.kotlinlogo),
        SkillsData(Res.string.jetpack, Res.drawable.composelogo),
        SkillsData(Res.string.studio, Res.drawable.androidstudiologo),
        SkillsData(Res.string.gradle, Res.drawable.gradle),
        SkillsData(Res.string.retrofit, Res.drawable.internet),
        SkillsData(Res.string.room, Res.drawable.database),
        SkillsData(Res.string.github, Res.drawable.git3),
    ),

    val otherSkills: List<SkillsData> = listOf(
        SkillsData(Res.string.firebase, Res.drawable.firebase),
        SkillsData(Res.string.ui_ux, Res.drawable.uilogo),
        SkillsData(Res.string.kotlin_multiplatform, Res.drawable.kotlinlogo),
        SkillsData(Res.string.compose_multiplatform, Res.drawable.composelogo),
        SkillsData(Res.string.responsive_design, Res.drawable.windowslogo),
        SkillsData(Res.string.scrumm, Res.drawable.agile),

        ),
    val softSkills: List<SkillsData> = listOf(
        SkillsData(Res.string.problems_solving, Res.drawable.idea),
        SkillsData(Res.string.communication, Res.drawable.code),
        SkillsData(Res.string.agile, Res.drawable.agile),
        SkillsData(Res.string.collaboration, Res.drawable.team),
        ),


    val educationList: List<EducationItem> = listOf(
        EducationItem("Computer Engineering at Central University of Las Villas ", false),
        EducationItem(
            "Create the User Interface in Android Studio",
            true,
            "https://www.coursera.org/account/accomplishments/verify/HJXMVW3YHVBV"
        ),
        EducationItem(
            "Advanced Programming in Kotlin",
            true,
            "https://www.coursera.org/account/accomplishments/verify/2TB1PPBEBHAX"
        ),
        EducationItem(
            "Working with Data in Android",
            true,
            "https://www.coursera.org/account/accomplishments/verify/L13KU4P3BNF5"
        ),
        EducationItem(
            "Version Control",
            true,
            "https://www.coursera.org/account/accomplishments/verify/SOKLTXW3134B"
        ),
        EducationItem(
            "Principles of UX/UI Design",
            true,
            "https://www.coursera.org/account/accomplishments/verify/PK1EAVGJX703"
        ),
        EducationItem(
            "Foundations of User Experience (UX) Design",
            true,
            "https://www.coursera.org/account/accomplishments/verify/NLD9QKFX94VE"
        )
    ),
    val experienceList: List<Experience> = listOf(
        Experience(
            Res.string.freelance, Res.string.upwork, Res.string.remote, Res.string.date1,
            Res.drawable.undraw_building_a_website_1wrp
        ),
        Experience(
            Res.string.comp,
            Res.string.xetid,
            Res.string.hybrid,
            Res.string.date2,
            Res.drawable.undraw_programmer_raqr
        ),
        Experience(
            Res.string.intern,
            Res.string.university,
            Res.string.in_person,
            Res.string.date3,
            Res.drawable.undraw_file_search_cbur
        )
    )
)

data class EducationItem(
    val name: String,
    val haveCertification: Boolean = false,
    val certificationURL: String? = null
)

data class Experience(
    val experience: StringResource,
    val companyName: StringResource,
    val typeJob: StringResource,
    val date: StringResource,
    val image: DrawableResource,
)
data class SkillsData(
    val skill: StringResource,
    val image: DrawableResource
)
