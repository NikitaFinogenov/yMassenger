package com.example.ymassenger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ymassenger.ui.LoginScreen
import com.example.ymassenger.ui.RegScreen
import com.example.ymassenger.ui.theme.MainScreen
import com.example.ymassenger.ui.theme.YMassengerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()
            YMassengerTheme {
                // A surface container using the 'background' color from the theme
                NavHost(navController = navController, startDestination = "loginscreen") {
                    composable("loginscreen") {

                        LoginScreen(
                            onNextScreenClick = { navController.navigate("regscreen") },
                            onSignUpClick = { navController.navigate("mainscreen") })
                        //navController.navigate("regscreen")
                    }
                    composable("regscreen") {
                        RegScreen {
                            navController.navigate("mainscreen")
                        }
                    }
                    composable("mainscreen") {
                        MainScreen()
                    }
                }


            }
        }
    }

}

