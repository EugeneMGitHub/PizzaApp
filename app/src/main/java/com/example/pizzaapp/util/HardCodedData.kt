package com.example.pizzaapp.util

import androidx.annotation.DrawableRes
import com.example.pizzaapp.R
import com.example.pizzaapp.presentation.ui.screens.menuScreen.MenuScreenEvents


val categoryList : List<MenuScreenEvents> = listOf(
    MenuScreenEvents.onPizzaCategoryClick,
    MenuScreenEvents.onComboCategoryClick,
    MenuScreenEvents.onDesertCategoryClick,
    MenuScreenEvents.onDrinksCategoryClick,
)


val listOfCities: List<String> = listOf(
    "Москва",
    "Санкт Петербург",
    "Тверь",
    "Тула",
    "Воронеж"
)



data class BanersWithInfo (
    val banerInfo: String,
    @DrawableRes val imageResourceId: Int
)

val listOfBanersWithInfo: List<BanersWithInfo> = listOf(
    BanersWithInfo(banerInfo = "FirstBaner", imageResourceId = R.drawable.pizzabannermain),
    BanersWithInfo(banerInfo = "FirstBaner", imageResourceId = R.drawable.pizzabanersecond),
)

data class FoodInfo(
    val name: String,
    val description: String,
    val image: Int,
)

data class FoodInfoNetwork(
    val name: String,
    val description: String,
    val image: String,
)

val listOfPizzas: List<FoodInfo> = listOf(
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
        ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
    FoodInfo("Ветчина и грибы", "Ветчина,шампиньоны, увеличинная порция моцареллы, томатный соус",
        image = R.drawable.pizza1
    ),
)


val listOfCombo: List<FoodInfo> = listOf(
    FoodInfo("Комбо Воскресное", "Напиток, пицца оригинальная, большая картошка",
        image = R.drawable.kombo1
    ),
    FoodInfo("Комбо сладкое", "Сладкая пицца, Сладкие роллы, чай",
        image = R.drawable.kombo1
    ),
    FoodInfo("Комбо прекрасное", " Две пиццы с сыром и кофе",
        image = R.drawable.kombo1
    ),
)

val listOfDrinks: List<FoodInfo> = listOf(
    FoodInfo("Чай", "Зеленый или черный чай",
        image = R.drawable.drink1
    ),
    FoodInfo("Сок", "Апельсиновый или яблочный сок",
        image = R.drawable.drink1
    ),
    FoodInfo("Кофе", "Латте и другие виды.",
        image = R.drawable.drink1
    ),
)

val listOfDeset: List<FoodInfo> = listOf(
    FoodInfo("Торт шоколадный", "Большой торт со сгущенкой",
        image = R.drawable.desert1
    ),
    FoodInfo("Пирожки домашние", "Пирожок с картошкой",
        image = R.drawable.desert1
    ),
    FoodInfo("Маффины", "3 сладких маффина",
        image = R.drawable.desert1
    ),
)




