package com.example.lab09_ejercicio1

import retrofit2.http.GET
import retrofit2.http.Path

interface RecipeApiService {
    @GET("recipes")
    suspend fun getRecipes(): RecipeResponse

    @GET("recipes/{id}")
    suspend fun getRecipeById(@Path("id") id: Int): RecipeModel
}