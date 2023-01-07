package com.jekis.dogglers.data

import com.jekis.dogglers.R
import com.jekis.dogglers.model.Dog

class DataSource {
    fun loadData(): List<Dog> {
        return listOf(
            Dog(R.drawable.dog_1, "Sheree", R.string.dog1_name, 2, "Bring a ball"),
            Dog(R.drawable.dog_2, "Hatiko", R.string.dog2_name, 3, "Wait an owner"),
            Dog(R.drawable.dog_3, "Basya", R.string.dog3_name, 2, "Gnawing on sneakers"),
            Dog(R.drawable.dog_4, "Vasilisa", R.string.dog4_name,1, "lick your ears"),
            Dog(R.drawable.dog_5, "Reks", R.string.dog5_name, 3, "Look at walkers"),
            Dog(R.drawable.dog_6, "Strongman", R.string.dog6_name, 2, "Sleep at the table"),
            Dog(R.drawable.dog_7, "Flash", R.string.dog7_name, 4, "Chasing neighbours"),
            Dog(R.drawable.dog_8, "Assol", R.string.dog8_name, 3, "Swim"),
            Dog(R.drawable.dog_9, "Ray", R.string.dog9_name, 5, "Walk with mother"),
            Dog(R.drawable.dog_10, "Garik", R.string.dog10_name, 2, "bite the heels")
        )
    }
}