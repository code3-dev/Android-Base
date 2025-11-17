package com.ubonab.zarino.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ubonab.zarino.R
import com.ubonab.zarino.components.ImageSlider

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App name
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 8.dp)
        )
        
        // Image slider
        ImageSlider(
            images = listOf(R.drawable.slider),
            autoScroll = true,
            scrollDelay = 3000L
        )
        
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.home),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineSmall
            )
        }
        
        Text(
            text = "این صفحه خانه است",
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun SearchScreen() {
    ScreenContent(
        title = stringResource(R.string.search),
        description = "این صفحه جستجو است"
    )
}

@Composable
fun FavoritesScreen() {
    ScreenContent(
        title = stringResource(R.string.favorites),
        description = "این صفحه مورد علاقه‌ها است"
    )
}

@Composable
fun ProfileScreen() {
    ScreenContent(
        title = stringResource(R.string.profile),
        description = "این صفحه پروفایل است"
    )
}

@Composable
fun SettingsScreen() {
    ScreenContent(
        title = stringResource(R.string.settings),
        description = "این صفحه تنظیمات است"
    )
}

@Composable
private fun ScreenContent(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App name
        Text(
            text = stringResource(R.string.app_name),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .padding(top = 16.dp, bottom = 8.dp)
        )
        
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineSmall
            )
        }
        
        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}