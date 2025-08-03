package com.example.my_e_commerceapp.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun OrdersScreen(navController:NavHostController) {
    val dummyOrders = listOf(
        "Order #1001 - Shoes",
        "Order #1002 - Mobile Phone",
        "Order #1003 - T-Shirt",
        "Order #1004 - Book"
    )
Scaffold{ padding ->
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(2.dp)
    ) {
        Text("My Orders", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))

        Text("Current Order", fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(dummyOrders) { order ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 4.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(order, fontSize = 16.sp)
                        Text("Status: Running", fontSize = 14.sp, color = MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }
}}
