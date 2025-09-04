package com.saico.prtfoliommp.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// Posiblemente necesites una forma de obtener el ancho de la ventana actual.
// Para Compose Multiplatform puro, BoxWithConstraints es la forma más directa
// de obtener las dimensiones disponibles para un composable específico.


// Estos son puntos de interrupción comunes, puedes ajustarlos.
private val BreakpointCompact = 600.dp
private val BreakpointMedium = 840.dp

@Composable
fun calculateWindowSizeClass(windowWidth: Dp): WindowSizeClass {
    return when {
        windowWidth < 0.dp -> throw IllegalArgumentException("Width cannot be negative")
        windowWidth < BreakpointCompact -> WindowSizeClass.Compact
        windowWidth < BreakpointMedium -> WindowSizeClass.Medium
        else -> WindowSizeClass.Expanded
    }
}
