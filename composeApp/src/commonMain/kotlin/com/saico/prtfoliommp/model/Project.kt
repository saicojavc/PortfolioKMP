package com.saico.prtfoliommp.model

import org.jetbrains.compose.resources.DrawableResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.p1_airline
import portfolio.composeapp.generated.resources.p2_shop
import portfolio.composeapp.generated.resources.p3_house
import portfolio.composeapp.generated.resources.p4_ticket
import portfolio.composeapp.generated.resources.p5_jit

data class Project(
    val id: Int,
    val projectName: String,
    val projectImage: DrawableResource,
    val description: String,
    val hasGithubRepo: Boolean,
    val githubRepoUrl: String? = null
)
val listOfProjects = listOf(
    Project(
        id = 1,
        projectName = "AirlineTicket",
        projectImage = Res.drawable.p1_airline,
        description = "Airline application with booking features.",
        hasGithubRepo = true,
        githubRepoUrl = "https://github.com/saicojavc/airlineticket.git"
    ),
    Project(
        id = 2,
        projectName = "OnShop",
        projectImage = Res.drawable.p2_shop,
        description = "Online shopping application.",
        hasGithubRepo = true,
        githubRepoUrl = "https://github.com/saicojavc/onshop.git"
    ),
    Project(
        id = 3,
        projectName = "YourHome",
        projectImage = Res.drawable.p3_house,
        description = "Real state application.",
        hasGithubRepo = true,
        githubRepoUrl = "https://github.com/saicojavc/YourHome.git"
    ),
    Project(
        id = 4,
        projectName = "Ticket",
        projectImage = Res.drawable.p4_ticket,
        description = "Ticket booking application for establishments and services.",
        hasGithubRepo = false,
    ),
    Project(
        id = 5,
        projectName = "JIT",
        projectImage = Res.drawable.p5_jit,
        description = "Just-in-Time Application for Transportation Management.",
        hasGithubRepo = false
    )
)