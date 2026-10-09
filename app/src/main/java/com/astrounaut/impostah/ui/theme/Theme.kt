package com.astrounaut.impostah.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val NormalColorScheme =
    darkColorScheme(
        primary = Saffron,
        onPrimary = Graphite,
        secondary = OffWhite,
        onSecondary = Graphite,
        background = Graphite,
        onBackground = OffWhite,
        surface = GraphiteSurface,
        onSurface = OffWhite,
        onSurfaceVariant = Muted,
        outline = Line,
    )

private val AfterDarkColorScheme =
    darkColorScheme(
        primary = Cherry,
        onPrimary = NearBlack,
        secondary = Cream,
        onSecondary = NearBlack,
        background = NearBlack,
        onBackground = Cream,
        surface = NearBlackSurface,
        onSurface = Cream,
        onSurfaceVariant = MutedWarm,
        outline = MutedWarm,
    )

@Composable
fun ImpostahTheme(
    variant: ThemeVariant = ThemeVariant.Normal,
    content: @Composable () -> Unit,
) {
    val colorScheme =
        when (variant) {
            ThemeVariant.Normal -> NormalColorScheme
            ThemeVariant.AfterDark -> AfterDarkColorScheme
        }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
