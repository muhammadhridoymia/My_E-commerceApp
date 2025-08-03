package com.example.my_e_commerceapp.Screens

import android.R.attr.contentDescription
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen( navController: NavHostController) {
    val tabs = listOf("All", "Best Sell")
    var selectedTabIndex by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
            NavigationBarItem(
                    selected = false,
                    onClick = {navController.navigate("orders_screen") },
                    icon = { Icon(Icons.Default.List, contentDescription = "Orders") },
                    label = { Text("Orders") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate("home_screen") },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("profile_screen") },
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("cart_screen")},
                    icon = { Text("🛒")},
                    label = { Text("My Cart") }
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            // Ad Banner
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(8.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text("Ad Banner", color = Color.White)
            }

            // Categories Horizontal Scroll
            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(listOf("Shoes", "Phones", "Watches", "Shirts", "Books")) { category ->
                    Box(
                        modifier = Modifier
                            .background(Color.LightGray, RoundedCornerShape(12.dp))
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .clickable { navController.navigate("category_screen/$category") }
                    ) {
                        Text(category)
                    }
                }
            }

            // Tabs: All & Best Sell
//            TabRow(selectedTabIndex = selectedTabIndex) {
//                tabs.forEachIndexed { index, title ->
//                    Tab(
//                        selected = selectedTabIndex == index,
//                        onClick = { selectedTabIndex = index },
//                        text = { Text(title) }
//                    )
//                }
//            }

            // Product Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(10) { index ->
                    val productName="Product $index"
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                            .background(Color.LightGray, RoundedCornerShape(8.dp))
                            .clickable {
                                navController.navigate("product_details_screen/$productName")
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(productName)
                    }
                }
            }
        }
    }
}
