package com.example.my_e_commerceapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProductDetailsScreen(productName: String) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(2.dp)
        ) {
            // Image Box
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text("Image", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Product Details", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Product Name: $productName", fontSize = 18.sp)
            Text("Price: $100", fontSize = 16.sp)
            Text("Description: This is a sample product description.", fontSize = 14.sp)

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Order Now Button
                Button(
                    onClick = { /* TODO: Handle order now */ },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Order Now")
                }

                // Add to Cart Button
                OutlinedButton(
                    onClick = { /* helo*/ },
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Add to Cart")
                }
            }


            Spacer(modifier = Modifier.height(24.dp))

            Text("Other Product Suggestions", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))

            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                items(listOf("Item A", "Item B", "Item C")) { suggestion ->
                    Box(
                        modifier = Modifier
                            .size(120.dp)
                            .background(Color.LightGray, RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(suggestion)
                    }
                }
            }
        }
    }
}
