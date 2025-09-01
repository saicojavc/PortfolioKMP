package com.saico.prtfoliommp.feature.portfolioScreen

import androidx.compose.runtime.Composable
import com.saico.prtfoliommp.feature.portfolioScreen.screenSize.CompactPortfolioScreen
import com.saico.prtfoliommp.feature.portfolioScreen.screenSize.ExtendPortfolioScreen
import com.saico.prtfoliommp.util.WindowSizeClass

@Composable
fun PortfolioScreen(windowSizeClass: WindowSizeClass) {

    PortfolioContent(windowSizeClass = windowSizeClass)

}

@Composable
fun PortfolioContent(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactPortfolioScreen()
        WindowSizeClass.Medium -> ExtendPortfolioScreen(windowSizeClass = windowSizeClass)
        WindowSizeClass.Expanded -> ExtendPortfolioScreen(windowSizeClass = windowSizeClass)
    }
}