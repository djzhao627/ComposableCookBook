package com.raywenderlich.android.composableCookBook

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumnFor(items = recipes) {
        RecipeCard(recipe = it)
    }
}