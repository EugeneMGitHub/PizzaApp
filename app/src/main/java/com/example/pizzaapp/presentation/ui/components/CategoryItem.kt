package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Shapes
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.presentation.ui.theme.mainRedColor

@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    itemText: String,
    selected: Boolean = false,
    onCategoryClick: () -> Unit = {}
){

    val buttonShape = MaterialTheme.shapes.small

    var textColor = Color.LightGray
    var cardColor = Color.White

    if (selected) {
        cardColor = Color(245, 206, 215)
        textColor = mainRedColor
    }

    Button(
        modifier = modifier
            .width(120.dp)

            .padding(end = 15.dp),
        onClick = { onCategoryClick()  },
        colors = ButtonDefaults.textButtonColors(containerColor = cardColor),
        shape = buttonShape,
//        elevation = ButtonDefaults.buttonElevation(
//            defaultElevation = 10.dp
//        )
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
//            pressedElevation = 15.dp,
//            disabledElevation = 0.dp,
//            hoveredElevation = 15.dp,
//            focusedElevation = 10.dp
        )

    ) {
        Text(
            text = itemText,
            color = textColor)
    }

}