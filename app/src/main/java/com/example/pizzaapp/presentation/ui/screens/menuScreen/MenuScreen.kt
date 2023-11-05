package com.example.pizzaapp.presentation.ui.screens.menuScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


import androidx.compose.ui.unit.Dp

import androidx.compose.ui.unit.dp

import com.example.pizzaapp.presentation.ui.components.AppDivider
import com.example.pizzaapp.presentation.ui.components.FoodItem
import com.example.pizzaapp.presentation.ui.components.NavigationBar
import com.example.pizzaapp.presentation.ui.components.ShowBanners
import com.example.pizzaapp.presentation.ui.components.ShowCategoryList

import com.example.pizzaapp.util.categoryList

val defaultPadding = 15.dp
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuScreen(
    scaffoldBottomPadding: Dp,
    menuScreenViewModel: MenuScreenViewModel,
    )
{

    LaunchedEffect(key1 = Unit,){
        menuScreenViewModel.onEvent(MenuScreenEvents.onPizzaCategoryClick)
}

    val city = menuScreenViewModel.city




    val listOfFood by menuScreenViewModel.listOfFood.collectAsState()

    var currentCategory : MenuScreenEvents by remember {
        mutableStateOf(MenuScreenEvents.onPizzaCategoryClick)
    }

    Column (
        modifier = Modifier
            .padding(
                bottom = scaffoldBottomPadding,
                top = defaultPadding
            )
    ) {


        NavigationBar(
            modifier = Modifier.padding(start = defaultPadding,end = defaultPadding),
            city = city,
            onCityChanged = { city ->
                menuScreenViewModel.changeCity(city)
            }
        )









      LazyColumn(){


          stickyHeader {
              ShowBanners()
          }

          stickyHeader {
              ShowCategoryList(
                  onCategorySelected = {
                      category -> currentCategory = category
                  },
                  categoryList = categoryList,
                  menuScreenViewModel = menuScreenViewModel
              )
          }

          itemsIndexed(listOfFood){ index, foodInfo ->
              if (index != 0) {
                  AppDivider()
              }
              FoodItem(
                  modifier = Modifier.padding(start = defaultPadding, end = defaultPadding),
                  foodInfo = foodInfo)
          }



      }

    }

}

