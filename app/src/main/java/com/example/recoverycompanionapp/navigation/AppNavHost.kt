package com.example.recoverycompanionapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recoverycompanionapp.ui.screens.home.HomeScreen
import com.example.recoverycompanionapp.ui.screens.journal.JournalScreen
import com.example.recoverycompanionapp.ui.screens.urge.UrgeScreen
import com.example.recoverycompanionapp.ui.screens.stats.StatsScreen


@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("journal") {
            JournalScreen()
        }
        composable("urge") {
            UrgeScreen()
        }
        composable("stats") {
            StatsScreen()
        }
    }
}
