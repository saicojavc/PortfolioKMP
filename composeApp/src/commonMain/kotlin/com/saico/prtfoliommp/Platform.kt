package com.saico.prtfoliommp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform