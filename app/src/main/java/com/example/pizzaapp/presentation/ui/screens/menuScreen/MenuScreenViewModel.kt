package com.example.pizzaapp.presentation.ui.screens.menuScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

import com.example.pizzaapp.data.remote.repository.ApiRepository
import com.example.pizzaapp.util.FoodInfoNetwork
import com.example.pizzaapp.util.listOfCities
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MenuScreenViewModel @Inject constructor(
//    private val databaseRepository: DatabaseRepository,
    private val repository: ApiRepository,
) : ViewModel() {


    var city by mutableStateOf(listOfCities[0])
        private set

    private var _listOfFood= MutableStateFlow<List<FoodInfoNetwork>>(emptyList())
    val listOfFood = _listOfFood.asStateFlow()


suspend fun onEvent(event: MenuScreenEvents){
    when (event) {
        is MenuScreenEvents.onPizzaCategoryClick -> {

            getMeals(event.networkName)
        }
                is MenuScreenEvents.onComboCategoryClick -> {

            getMeals(event.networkName)
        }
                is MenuScreenEvents.onDesertCategoryClick -> {

            getMeals(event.networkName)
        }
        is MenuScreenEvents.onDrinksCategoryClick -> {

            getMeals(event.networkName)
        }
    }
}




    fun changeCity(city: String){
       this.city = city
    }


    suspend fun getMeals(category: String){


        repository.getMeal(category)
            .let {Response ->
        if (Response.isSuccessful){
           val listOfCategory = Response.body()?.meals?.take(5)
           val newList =  listOfCategory?.map { mealInformation ->
                FoodInfoNetwork(name = mealInformation.strMeal, description = mealInformation.idMeal, image = mealInformation.strMealThumb)
            }
            if (newList != null) {
                _listOfFood.value = newList
            }
        }
        }


    }

}