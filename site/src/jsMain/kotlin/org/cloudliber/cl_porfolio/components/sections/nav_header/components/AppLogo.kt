@file:Suppress("DEPRECATION")

package org.cloudliber.cl_porfolio.components.sections.nav_header.components

import androidx.compose.runtime.Composable
import org.cloudliber.cl_porfolio.theme.fonts.DisplayTextStyle
import org.cloudliber.cl_porfolio.theme.fonts.TextStyle
import org.cloudliber.cl_porfolio.theme.fonts.TextStylePrimaryColor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.navigation.Anchor
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.ComponentVariant
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem

val AppLogoStyle by ComponentStyle {
    base {
        Modifier.display(DisplayStyle.Flex)
    }
    Breakpoint.ZERO {
        Modifier.height(1.625.cssRem)
    }
    Breakpoint.SM {
        Modifier.height(1.75.cssRem)
    }
    Breakpoint.MD {
        Modifier.height(1.8.cssRem)
    }
    Breakpoint.LG {
        Modifier.height(1.85.cssRem)
    }
    Breakpoint.XL {
        Modifier.height(2.125.cssRem)
    }
}

@Composable
fun AppLogo(
    colorMode: ColorMode,
    variant: ComponentVariant? = null
) {
    Anchor(href = "/") {
//        Img(
//            src = when (colorMode) {
//                ColorMode.LIGHT -> Res.Images.LOGO_LIGHT
//                ColorMode.DARK -> Res.Images.LOGO_DARK
//            },
//            attrs = AppLogoStyle.toAttrs(variant)
//        )


        SpanText(
            modifier = TextStyle.toModifier(DisplayTextStyle, TextStylePrimaryColor)
                .textAlign(TextAlign.Start),
            text = "CloudLiber"
        )
    }
}