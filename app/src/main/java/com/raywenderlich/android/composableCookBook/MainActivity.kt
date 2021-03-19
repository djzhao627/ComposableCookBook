package com.raywenderlich.android.composableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                TopAppBar(title = {
                    Text(text = "ComposableCookBook")
                })
                RecipeList(defaultRecipes)
            }
        }
    }
}

@Preview
@Composable
fun Greeting() {
    Column {
        Text(text = "Hello Compose", style = TextStyle(color = Color.Red))
        Text(text = "Hello Again", style = TextStyle(color = Color.Red))
        Text(text = "Hello One More Time", style = TextStyle(color = Color.Red))
    }
}
