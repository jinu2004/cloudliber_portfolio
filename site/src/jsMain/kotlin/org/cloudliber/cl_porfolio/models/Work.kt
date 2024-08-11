package org.cloudliber.cl_porfolio.models

import org.cloudliber.cl_porfolio.utils.Res

enum class Work(
    val workName: String,
    val description: String,
    val link: String,
    val imageRes: String,
) {
    RestaurantManage(
        workName = "RestaurantManage",
        description = "desktop application & Backend & Design",
        link = "https://github.com/jinu2004/Resturant.git",
        imageRes = Res.Images.DESIGN_2
    ),

}