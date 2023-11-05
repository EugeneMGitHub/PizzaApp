package com.example.pizzaapp.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreenEvents
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreenViewModel
import com.example.pizzaapp.presentation.ui.screens.menuScreen.defaultPadding
import kotlinx.coroutines.launch

@Composable
fun ShowCategoryList(
    onCategorySelected: (MenuScreenEvents) -> Unit,
    categoryList: List<MenuScreenEvents> = emptyList(),
    menuScreenViewModel: MenuScreenViewModel,
) {

    val coroutineScope = rememberCoroutineScope()

    var indexOfTabCategory by remember {
        mutableStateOf(0)
    }

    Box(
        modifier = Modifier
            .background(Color.White)
    ){
        LazyRow (modifier = Modifier
            .padding(
                top = defaultPadding,
                bottom = defaultPadding *2)
        ) {

            itemsIndexed(categoryList){ index, category ->

                var leftPadding = 0.dp

                if (index == 0){
                    leftPadding = defaultPadding
                }

                CategoryItem(
                    modifier = Modifier.padding(start = leftPadding),
                    itemText = category.name,
                    selected = indexOfTabCategory == index,
                    onCategoryClick = {
                        indexOfTabCategory = index
                        coroutineScope.launch {
                            menuScreenViewModel.onEvent(category)
                        }

                    }
                )
            }

        }
    }
}