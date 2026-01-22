package com.example.recoverycompanionapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StreakCard(streakCount: Int) {
    Card {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Current Streak")
            Text(text = "$streakCount days")
        }
    }
}
