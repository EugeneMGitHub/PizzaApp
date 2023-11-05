package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.presentation.ui.screens.menuScreen.defaultPadding
import com.example.pizzaapp.util.listOfBanersWithInfo

@Composable
fun ShowBanners (){
    LazyRow () {

        itemsIndexed(listOfBanersWithInfo){ index, banerItem ->

            var leftPadding = 0.dp

            if (index == 0){
                leftPadding = defaultPadding
            }

            BannerItem(
                banerItem = banerItem,
                modifier = Modifier.padding(
                    top = defaultPadding,
                    start = leftPadding,
                    end = defaultPadding
                )
            )
        }

    }
}