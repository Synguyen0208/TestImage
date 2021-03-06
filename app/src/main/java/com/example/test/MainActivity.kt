package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.ui.theme.TestTheme
import  androidx.compose.foundation.Image
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
                Image()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun Image() {
    Image(painter = rememberImagePainter(
        data = "https://www.example.com/image.jpg",
        builder = {
            transformations(CircleCropTransformation())
        }
    ), contentDescription = "")
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestTheme {
        Greeting("Android")
    }
}