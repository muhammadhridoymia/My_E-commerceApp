package com.example.my_e_commerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.my_e_commerceapp.ui.theme.My_EcommerceAppTheme
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My_EcommerceAppTheme {
                val navController=rememberNavController()
                Navigations(navController)
            }
        }
    }
}

