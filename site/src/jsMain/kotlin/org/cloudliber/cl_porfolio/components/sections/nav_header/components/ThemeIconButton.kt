@file:Suppress("DEPRECATION")

package org.cloudliber.cl_porfolio.components.sections.nav_header.components

import androidx.compose.runtime.Composable
import org.cloudliber.cl_porfolio.components.widgets.button.PrimaryIconButton
import org.cloudliber.cl_porfolio.theme.icons.DarkModeIcon
import org.cloudliber.cl_porfolio.theme.icons.LightModeIcon
import org.cloudliber.cl_porfolio.theme.icons.IconStyle
import org.cloudliber.cl_porfolio.theme.icons.IconOnBrandColorVariant
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode

@Composable
fun ThemeIconButton(
    colorMode: ColorMode = ColorMode.current,
    onClick: () -> Unit,
) {
    PrimaryIconButton(
        onClick = {
            onClick()
        },
    ) {
        val iconModifier = IconStyle.toModifier(IconOnBrandColorVariant)
        when (colorMode) {
            ColorMode.LIGHT -> LightModeIcon(modifier = iconModifier)
            ColorMode.DARK -> DarkModeIcon(modifier = iconModifier)
        }
    }
}