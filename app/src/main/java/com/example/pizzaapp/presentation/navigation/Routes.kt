package com.example.pizzaapp.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

//sealed class Routes(val icon: ImageVector, val route: String){
//    object MainScreen : Routes(Icons)
//}
//



sealed class RoutesBottomNavigation(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val route: String
) {

    object Menu : RoutesBottomNavigation(
        title = Constants.Screens.MENU_SCREEN,
        selectedIcon = Icons.Filled.Menu,
        unSelectedIcon = Icons.Outlined.Menu,
        route = Constants.Screens.MENU_SCREEN
    )
    object Profile : RoutesBottomNavigation(
        title = Constants.Screens.PROFILE_SCREEN,
        selectedIcon = Icons.Filled.AccountCircle,
        unSelectedIcon = Icons.Outlined.AccountCircle,
        route = Constants.Screens.PROFILE_SCREEN
    )

    object Cart : RoutesBottomNavigation(
        title = Constants.Screens.CART_SCREEN,
        selectedIcon = Icons.Filled.ShoppingCart,
        unSelectedIcon = Icons.Outlined.ShoppingCart,
        route = Constants.Screens.CART_SCREEN
    )





}


class Constants {
    object Screens{
        const val MENU_SCREEN = "Меню"
        const val PROFILE_SCREEN = "Профиль"
        const val CART_SCREEN = "Корзина"
    }
}

val bottomBarTabs = listOf(
    RoutesBottomNavigation.Menu,
    RoutesBottomNavigation.Profile,
    RoutesBottomNavigation.Cart,
)