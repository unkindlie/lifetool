package com.unkindlie.lifetool.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.unkindlie.lifetool.R

val productSansFamily = FontFamily(
    Font(R.font.productsans_thin, FontWeight.Thin),
    Font(R.font.productsans_light, FontWeight.Light),
    Font(R.font.productsans_regular, FontWeight.Normal),
    Font(R.font.productsans_medium, FontWeight.Medium),
    Font(R.font.productsans_bold, FontWeight.Bold),
    Font(R.font.productsans_black, FontWeight.Bold)
)

val defaultTypography = Typography()

val AppTypography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = productSansFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = productSansFamily),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = productSansFamily),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = productSansFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = productSansFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = productSansFamily),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = productSansFamily),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = productSansFamily),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = productSansFamily),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = productSansFamily),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = productSansFamily),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = productSansFamily),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = productSansFamily),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = productSansFamily),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = productSansFamily)
)
