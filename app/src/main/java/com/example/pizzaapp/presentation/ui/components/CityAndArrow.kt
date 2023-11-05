package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.util.listOfCities

@Composable
fun CityAndArrow(
    cityName: String,
    onCityChanged: (String) -> Unit,
    modifier : Modifier = Modifier,
    onCityClick: () -> Unit = {}
) {

    var selectedCity = "sd"
    var isOpen by remember { mutableStateOf(false) }

    Row(
        modifier
            .clickable { onCityClick() },
        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween
    ){

        Text(text = cityName,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Icon(
            imageVector = Icons.Filled.KeyboardArrowDown,
            contentDescription = null,
            modifier = Modifier
//                .align(Alignment.CenterVertically)
//                .align(Alignment.CenterEnd)
//                .padding(start = 8.dp)
                .size(24.dp),
        )


        DropdownMenu(
            expanded = isOpen,
            onDismissRequest = { isOpen = false }) {

            listOfCities.forEachIndexed { index, city ->
                DropdownMenuItem(
                    text = {Text(text = city) },
                    onClick = {
                        isOpen = false
                        onCityChanged(city)
                        selectedCity = city
                    })
            }

        }



    }
}