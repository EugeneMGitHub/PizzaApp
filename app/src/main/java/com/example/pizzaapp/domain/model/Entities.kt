package com.example.pizzaapp.domain.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    @PrimaryKey(autoGenerate = true)
    val categoryId:Int = 0,
    val categoryName: String,
)

@Entity
data class FoodObject(
    @PrimaryKey(autoGenerate = true)
    val foodObjectId: Int = 0,
    val categoryId: Int,

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    val img: ByteArray,
//    val img: ByteArray,
    val title: String,
    val description: String,
)
