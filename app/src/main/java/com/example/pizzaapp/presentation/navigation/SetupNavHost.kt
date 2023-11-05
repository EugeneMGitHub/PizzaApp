package com.example.pizzaapp.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pizzaapp.presentation.ui.screens.cartScreen.CartScreen
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreen
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreenViewModel
import com.example.pizzaapp.presentation.ui.screens.profileScreen.ProfileScreen

@Composable
fun SetupNavHost(
    scaffoldBottomPadding: Dp,
    navController: NavHostController,
    menuScreenViewModel: MenuScreenViewModel,

    ){

    NavHost(
        navController = navController,
        startDestination = RoutesBottomNavigation.Menu.route
    ){

        composable(route = RoutesBottomNavigation.Menu.route){
            MenuScreen(
                menuScreenViewModel = menuScreenViewModel,
                scaffoldBottomPadding = scaffoldBottomPadding,
            )
        }

        composable(route = RoutesBottomNavigation.Profile.route){
            ProfileScreen()
        }
        composable(route = RoutesBottomNavigation.Cart.route){
            CartScreen()
        }




    }

}