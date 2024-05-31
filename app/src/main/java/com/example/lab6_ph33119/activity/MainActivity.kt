package com.example.lab6_ph33119


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab6_ph33119.ui.screens.Home
import com.example.lab6_ph33119.ui.screens.Bai1
import com.example.lab6_ph33119.ui.screens.Bai2
import com.example.lab6_ph33119.ui.screens.Bai3

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navControl = rememberNavController()
                NavHost(navController = navControl,
                    startDestination = "home"
                ){
                    composable("home"){
                        Home(navControl)
                    }
                    composable("bai1"){
                        Bai1()
                    }
                    composable("bai2"){
                        Bai2()

                    }
                    composable("bai3"){
                        Bai3()
                    }

                }
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

