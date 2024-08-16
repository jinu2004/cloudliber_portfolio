package org.cloudliber.cl_porfolio.models

import org.cloudliber.cl_porfolio.utils.Res

enum class Social(
    val link: String,
    val iconResLight: String,
    val iconResDark: String,
) {
    Email(
        link = Res.Strings.EMAIL_LINK,
        iconResLight = Res.Images.MAIL_LIGHT,
        iconResDark = Res.Images.MAIL_DARK
    ),
    GitHub(
        link = Res.Strings.GITHUB_LINK,
        iconResLight = Res.Images.GITHUB_LIGHT,
        iconResDark = Res.Images.GITHUB_DARK
    ),
    Instagram(
        link = Res.Strings.INSTAGRAM_LINK,
        iconResLight = Res.Images.INSTAGRAM_LIGHT,
        iconResDark = Res.Images.INSTAGRAM_DARK
    ),
}