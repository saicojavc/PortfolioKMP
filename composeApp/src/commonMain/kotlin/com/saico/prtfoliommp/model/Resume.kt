package com.saico.prtfoliommp.model

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
        EducationItem("Create the User Interface in Android Studio", true, "https://www.coursera.org/account/accomplishments/verify/HJXMVW3YHVBV"),
        EducationItem("Advanced Programming in Kotlin",true, "https://www.coursera.org/account/accomplishments/verify/2TB1PPBEBHAX"),
        EducationItem("Working with Data in Android",true, "https://www.coursera.org/account/accomplishments/verify/L13KU4P3BNF5"),
        EducationItem("Version Control", true,"https://www.coursera.org/account/accomplishments/verify/SOKLTXW3134B"),
        EducationItem("Principles of UX/UI Design",true, "https://www.coursera.org/account/accomplishments/verify/PK1EAVGJX703"),
        EducationItem("Foundations of User Experience (UX) Design",true, "https://www.coursera.org/account/accomplishments/verify/NLD9QKFX94VE")
    ),
    val experienceList: List<String> = listOf(
        "Android Developer in XETID", "Android Developer in Upwork"
    )
)

data class EducationItem(
    val name: String,
    val haveCertification: Boolean = false,
    val certificationURL: String? = null
)
