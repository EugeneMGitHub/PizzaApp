package com.example.pizzaapp.presentation.ui.screens.menuScreen

sealed interface MenuScreenEvents {

    val name: String
    val networkName:String

    object onPizzaCategoryClick: MenuScreenEvents {
        override val name = "Паста"
        override val networkName: String = "Pasta"
    }
    object onComboCategoryClick: MenuScreenEvents {
        override val name = "Рыба"
        override val networkName: String = "Seafood"
    }
    object onDesertCategoryClick: MenuScreenEvents {
        override val name = "Десерт"
        override val networkName: String = "Dessert"
    }
    object onDrinksCategoryClick: MenuScreenEvents {
        override val name = "Завтрак"
        override val networkName: String = "Breakfast"
    }
}
