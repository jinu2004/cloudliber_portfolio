package org.cloudliber.cl_porfolio.pages

import androidx.compose.runtime.Composable
import org.cloudliber.cl_porfolio.components.layouts.DefaultPageLayout
import org.cloudliber.cl_porfolio.components.sections.about.AboutSection
import org.cloudliber.cl_porfolio.components.sections.contact.ContactSection
import org.cloudliber.cl_porfolio.components.sections.start.StartSection
import org.cloudliber.cl_porfolio.components.sections.works.WorksSection
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    DefaultPageLayout(title = "Home") {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            StartSection()
            WorksSection()
            AboutSection()
            ContactSection()
        }
    }
}
