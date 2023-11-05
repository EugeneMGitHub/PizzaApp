package com.example.pizzaapp.data.remote

import com.example.pizzaapp.data.remote.models.meal
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("filter.php")
    suspend fun getMeal(
        @Query("c") category: String, // = "Dessert", //Dessert
        @Query("limit") limit: Int = 5
    ) : Response<meal>

}