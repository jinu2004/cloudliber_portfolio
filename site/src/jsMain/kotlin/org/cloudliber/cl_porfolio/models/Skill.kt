package org.cloudliber.cl_porfolio.models

import org.cloudliber.cl_porfolio.utils.Res

enum class Skill(
    val skillName: String,
    val level: String,
    val iconResLight: String,
    val iconResDark: String,
) {
    AndroidStudio(
        skillName = "Android Studio",
        level = "Skilled",
        iconResLight = Res.Images.ANDROID_STUDIO,
        iconResDark = Res.Images.ANDROID_STUDIO,
    ),
    IntellijIdea(
        skillName = "IntelliJ IDEA",
        level = "Skilled",
        iconResLight = Res.Images.INTELLIJ_IDEA,
        iconResDark = Res.Images.INTELLIJ_IDEA,
    ),
    Kotlin(
        skillName = "Kotlin",
        level = "Skilled",
        iconResLight = Res.Images.KOTLIN,
        iconResDark = Res.Images.KOTLIN
    ),
    JetpackCompose(
        skillName = "Compose",
        level = "Skilled",
        iconResLight = Res.Images.JETPACK_COMPOSE,
        iconResDark = Res.Images.JETPACK_COMPOSE
    ),
    GitHub(
        skillName = "GitHub",
        level = "Skilled",
        iconResLight = Res.Images.GITHUB_LIGHT,
        iconResDark = Res.Images.GITHUB_DARK
    ),
    Python(
        skillName = "Python",
        level = "Skilled",
        iconResLight = Res.Images.PYTHON,
        iconResDark = Res.Images.PYTHON
    ),
    Django(
        skillName = "Django",
        level = "Skilled",
        iconResLight = Res.Images.DJANGO,
        iconResDark = Res.Images.DJANGO
    ),
    Flask(
        skillName = "Flask",
        level = "Skilled",
        iconResLight = Res.Images.FLASK,
        iconResDark = Res.Images.FLASK
    ),

    Ktor(
        skillName = "Ktor",
        level = "Skilled",
        iconResLight = Res.Images.KTOR,
        iconResDark = Res.Images.KTOR,
    ),
    Figma(
        skillName = "Figma",
        level = "Skilled",
        iconResLight = Res.Images.FIGMA,
        iconResDark = Res.Images.FIGMA
    ),
    Postgresql(
        skillName = "PostgreSQL",
        level = "Novice",
        iconResLight = Res.Images.POSTGRESQL,
        iconResDark = Res.Images.POSTGRESQL
    ),
    Firebase(
        skillName = "Firebase",
        level = "Novice",
        iconResLight = Res.Images.FIREBASE,
        iconResDark = Res.Images.FIREBASE
    ),
    Kobweb(
        skillName = "Kobweb",
        level = "Skilled",
        iconResLight = Res.Images.KOBWEB,
        iconResDark = Res.Images.KOBWEB
    )
}