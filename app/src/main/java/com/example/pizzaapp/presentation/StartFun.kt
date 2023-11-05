package com.example.pizzaapp.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.pizzaapp.presentation.navigation.RoutesBottomNavigation
import com.example.pizzaapp.presentation.navigation.SetupNavHost
import com.example.pizzaapp.presentation.navigation.bottomBarTabs
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreenViewModel
import com.example.pizzaapp.presentation.ui.theme.mainRedColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartFun() {



    val navController = rememberNavController()
    val currentBackStack by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStack?.destination

    var bottomNavState by rememberSaveable {
        mutableStateOf(1)
    }
    var bottomNavStateRoutes by rememberSaveable {
        mutableStateOf(RoutesBottomNavigation.Menu.route)
    }

    val menuScreenViewModel: MenuScreenViewModel = hiltViewModel()


    Scaffold(
        bottomBar = {
            val currentScreen = bottomBarTabs.find { it.route == currentDestination?.route } ?: RoutesBottomNavigation.Menu
            NavigationBar(
                containerColor = Color(0xFFF0F0F0)
            ) {
                bottomBarTabs.forEachIndexed { index, item ->
                 NavigationBarItem(
                     selected = currentScreen.route == item.route,
                     onClick = {
                        bottomNavState = index
                        bottomNavStateRoutes = item.route
                        navController.navigate(item.route)
                     },
                     icon = {
                         Icon(
                             imageVector = if (bottomNavState == index) item.selectedIcon
                             else item.unSelectedIcon,
                             contentDescription = item.title
                         )
                     },
                     label = {Text(text = item.title, fontSize = 15.sp)},
                     colors = NavigationBarItemDefaults.colors(
                         selectedIconColor = mainRedColor,
                         selectedTextColor = mainRedColor,
                         indicatorColor = Color(0xFFF0F0F0),
                         unselectedIconColor = Color(0xFF808080),
                         unselectedTextColor = Color(0xFF808080),
                     )

                 )


                }

            }

        }



    ) {
        val scaffoldBottomPadding = it.calculateBottomPadding()

        SetupNavHost(
            menuScreenViewModel = menuScreenViewModel,
            scaffoldBottomPadding = scaffoldBottomPadding,
            navController = navController)
        }
}