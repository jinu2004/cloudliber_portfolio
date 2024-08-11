package org.cloudliber.cl_porfolio.models

enum class Section(
    val text: String,
    val id: String,
    val href: String = "#$id",
) {
    Start(
        id = "start",
        text = "Start"
    ),
    Works(
        id = "works",
        text = "Works"
    ),
    About(
        id = "about",
        text = "About us"
    ),
    Contact(
        id = "contact",
        text = "Contact us"
    )
}