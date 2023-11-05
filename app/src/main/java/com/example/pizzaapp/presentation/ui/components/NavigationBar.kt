package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.R

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    city: String,
    onCityChanged: (String) -> Unit,
) {
    Row(
       modifier
           .fillMaxWidth()
           .height(56.dp)
//           .padding(bottom = 30.dp, top = 30.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){


        CityAndArrow(
            cityName = city,
            onCityChanged = onCityChanged,
        )

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "QR code",
            modifier = Modifier.size(24.dp)
                .clickable {  }
        )


    }
}