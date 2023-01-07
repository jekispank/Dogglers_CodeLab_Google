package com.jekis.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @DrawableRes
    val imageResId: Int,
    val name: String,
    @StringRes
    val breed: Int,
    val age: Int,
    val habit: String
)
