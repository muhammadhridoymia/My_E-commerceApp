package com.example.my_e_commerceapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
//all screens
import com.example.my_e_commerceapp.Screens.HomeScreen
import com.example.my_e_commerceapp.Screens.OrdersScreen
import com.example.my_e_commerceapp.Screens.ProfileScreen
import com.example.my_e_commerceapp.Screens.ProductDetailsScreen
import com.example.my_e_commerceapp.Screens.CategoryScreen
import com.example.my_e_commerceapp.Screens.Cart
import com.example.my_e_commerceapp.Screens.SignInScreen
import com.example.my_e_commerceapp.Screens.LogInScreen
@Composable
fun Navigations(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable("home_screen") {
            HomeScreen(navController = navController)
        }
        composable("orders_screen") {
            OrdersScreen( navController=navController)
        }
        composable("profile_screen") {
            ProfileScreen( navController = navController)
        }
        composable("product_details_screen/{name}"){backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")?:"unknown"
            ProductDetailsScreen(productName = name)
        }
        composable("category_screen/{categoryName}"){backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName")?:"unknown"
            CategoryScreen(categoryName = categoryName)
        }
        composable("cart_screen") {
            Cart(navController = navController)
        }
        composable("sigin_screen"){
            SignInScreen(navController=navController)
        }
        composable("login_screen"){
            LogInScreen(navController=navController)
        }
    }
}