package com.example.shopapp

import androidx.annotation.DrawableRes

object Data {
    class Demo(
        @DrawableRes var image: Int,
        var name: String,
        var description: String,
        var price: String
    )

    var datalist = listOf(
        Demo(
            R.drawable.a,
            name = "The Co-ord",
            description = "The perfect fit for all your workouts.",
            price = "$20"
        ),
        Demo(
            R.drawable.b,
            name = "Denim essentials",
            description = "The perfect fit for all your outings.",
            price = "$25"
        ),
        Demo(
            R.drawable.a,
            name = "The Co-ord",
            description = "The perfect fit for all your workouts.",
            price = "$20"
        ),
        Demo(
            R.drawable.b,
            name = "Denim essentials",
            description = "The perfect fit for all your outings.",
            price = "$25"
        ),
        Demo(
            R.drawable.a,
            name = "The Co-ord",
            description = "The perfect fit for all your workouts.",
            price = "$20"
        ),
        Demo(
            R.drawable.b,
            name = "Denim essentials",
            description = "The perfect fit for all your outings.",
            price = "$25"
        ),
        Demo(
            R.drawable.a,
            name = "The Co-ord",
            description = "The perfect fit for all your workouts.",
            price = "$20"
        ),
        Demo(
            R.drawable.b,
            name = "Denim essentials",
            description = "The perfect fit for all your outings.",
            price = "$25"
        ),
    )
}