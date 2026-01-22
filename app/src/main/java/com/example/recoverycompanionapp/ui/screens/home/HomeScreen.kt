package com.example.recoverycompanionapp.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.recoverycompanionapp.ui.components.PrimaryButton
import com.example.recoverycompanionapp.ui.components.StreakCard

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = viewModel()) {
    val streak by viewModel.streak

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Home")
        StreakCard(streakCount = streak)

        PrimaryButton(
            text = "Journal",
            onClick = { navController.navigate("journal") }
        )

        PrimaryButton(
            text = "Urge Surf",
            onClick = { navController.navigate("urge") }
        )

        PrimaryButton(
            text = "Stats",
            onClick = { navController.navigate("stats") }
        )
    }
}
