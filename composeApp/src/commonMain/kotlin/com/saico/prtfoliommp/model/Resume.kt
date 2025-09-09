package com.saico.prtfoliommp.model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.comp
import portfolio.composeapp.generated.resources.date1
import portfolio.composeapp.generated.resources.date2
import portfolio.composeapp.generated.resources.date3
import portfolio.composeapp.generated.resources.freelance
import portfolio.composeapp.generated.resources.hybrid
import portfolio.composeapp.generated.resources.in_person
import portfolio.composeapp.generated.resources.intern
import portfolio.composeapp.generated.resources.remote
import portfolio.composeapp.generated.resources.undraw_building_a_website_1wrp
import portfolio.composeapp.generated.resources.undraw_file_search_cbur
import portfolio.composeapp.generated.resources.undraw_programmer_raqr
import portfolio.composeapp.generated.resources.university
import portfolio.composeapp.generated.resources.upwork
import portfolio.composeapp.generated.resources.xetid

data class Resume(
    val skillsList: List<String> = listOf(
        "Kotlin",
        "Jetpack Compose",
        "UI/UX",
        "Retrofit",
        "Room Database",
        "Gradle",
        "Android Studio",
        "Kotlin Multiplatform",
        "Compose Multiplatform"
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
