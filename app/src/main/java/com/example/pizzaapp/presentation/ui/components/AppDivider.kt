package com.example.pizzaapp.presentation.ui.components

import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppDivider (modifier: Modifier = Modifier){
    Divider(
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.05f),
        thickness = 1.dp, modifier = modifier
    )

}