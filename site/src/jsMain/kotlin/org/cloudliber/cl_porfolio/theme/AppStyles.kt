@file:Suppress("DEPRECATION")

package org.cloudliber.cl_porfolio.theme

import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.navigation.LinkStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.BreakpointSizes
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.CssStyleScope
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import com.varabyte.kobweb.silk.theme.modifyStyle
import org.cloudliber.cl_porfolio.utils.Res
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@InitSilk
fun initAppStyles(ctx: InitSilkContext) {
    ctx.stylesheet.apply {
        registerStyleBase("body") {
            Modifier.fontFamily(Res.FontFamilies.POPPINS_REGULAR, Res.FontFamilies.POPPINS_MEDIUM)
        }
    }
    ctx.theme.apply {
        breakpoints = BreakpointSizes(
            sm = 30.cssRem, // 480 px,
            md = 48.cssRem, // 768 px
            lg = 81.25.cssRem, // 1300 px
            xl = 100.cssRem, // 1600 px
        )
        modifyStyle(ButtonStyle, Modifier, fun CssStyleScope.() {
 base {
                Modifier.borderRadius(30.px)
            }
})
        modifyStyle(LinkStyle, Modifier, fun CssStyleScope.() {
 val colorPalette = colorMode.toPalette()
            base {
                Modifier
                    .textDecorationLine(TextDecorationLine.None)
                    .color(colorPalette.text.primary)
            }
})
    }
}