package com.svetlana.learn.borutoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.svetlana.learn.borutoapp.navigation.SetupNavGraph
import com.svetlana.learn.borutoapp.ui.theme.BorutoAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BorutoAppTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}