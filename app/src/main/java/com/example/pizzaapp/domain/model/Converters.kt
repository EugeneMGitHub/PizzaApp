package com.example.pizzaapp.domain.model

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import com.example.pizzaapp.R
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter
    fun toBitmap(imgId: Int, resources: Resources): Bitmap{
        return BitmapFactory.decodeResource(resources, imgId)
    }

    @TypeConverter
    fun fromBitmap(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)

        return outputStream.toByteArray()
    }

    @TypeConverter
    fun toBitmap(byteArray: ByteArray): Bitmap {
     return BitmapFactory.decodeByteArray(byteArray,0,byteArray.size)
    }

}