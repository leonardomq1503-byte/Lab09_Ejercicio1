package com.example.lab09_ejercicio1

import com.google.gson.annotations.SerializedName

data class RecipeResponse(
    @SerializedName("recipes") val recipes: List<RecipeModel>
)

data class RecipeModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("ingredients") val ingredients: List<String>,
    @SerializedName("instructions") val instructions: List<String>,
    @SerializedName("prepTimeMinutes") val prepTimeMinutes: Int,
    @SerializedName("cookTimeMinutes") val cookTimeMinutes: Int,
    @SerializedName("servings") val servings: Int,
    @SerializedName("difficulty") val difficulty: String,
    @SerializedName("cuisine") val cuisine: String,
    @SerializedName("caloriesPerServing") val caloriesPerServing: Int,
    @SerializedName("image") val image: String,
    @SerializedName("rating") val rating: Float,
    @SerializedName("reviewCount") val reviewCount: Int,
    @SerializedName("mealType") val mealType: List<String>
)