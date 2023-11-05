package com.example.pizzaapp.data.remote.repository

import com.example.pizzaapp.data.remote.ApiService
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getMeal(category: String) = apiService.getMeal(category)
}