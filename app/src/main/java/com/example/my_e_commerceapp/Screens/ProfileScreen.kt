package com.example.my_e_commerceapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(navController:NavHostController) {
    Scaffold{ paddingValues ->
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .padding(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profile Image Placeholder
        Box(
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text("Image", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Profile Info
        Text("Name: Hridoy", fontSize = 18.sp)
        Text("Email: hridoy@example.com", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(8.dp))

        Divider(color = Color.LightGray, thickness = 1.dp)

        Spacer(modifier = Modifier.height(8.dp))

        Text("My Cart", fontSize = 16.sp)
        Text("Address: Dhaka, Bangladesh", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Button(
                onClick = { navController.navigate("sigin_screen") },

                ) {
                Text("Signin")
            }
            Text("Order History ",fontSize = 25.sp)
        }
    }

}}
