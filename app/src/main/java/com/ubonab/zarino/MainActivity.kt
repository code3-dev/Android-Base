package com.ubonab.zarino

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.core.text.TextUtilsCompat
import androidx.core.view.ViewCompat
import com.ubonab.zarino.navigation.AnimatedBottomBar
import com.ubonab.zarino.navigation.NavigationItem
import com.ubonab.zarino.navigation.getOrderedNavigationItems
import com.ubonab.zarino.screens.FavoritesScreen
import com.ubonab.zarino.screens.HomeScreen
import com.ubonab.zarino.screens.ProfileScreen
import com.ubonab.zarino.screens.SearchScreen
import com.ubonab.zarino.screens.SettingsScreen
import com.ubonab.zarino.ui.theme.ZarinoTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        forcePersianLocale()
        forceRTL()
        enableEdgeToEdge()
        setContent {
            ZarinoTheme {
                MainScreen()
            }
        }
    }
    
    private fun forcePersianLocale() {
        val locale = Locale("fa")
        Locale.setDefault(locale)
        val config = resources.configuration
        config.setLocale(locale)
        config.setLayoutDirection(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
    
    private fun forceRTL() {
        ViewCompat.setLayoutDirection(findViewById(android.R.id.content), ViewCompat.LAYOUT_DIRECTION_RTL)
    }
}

@Composable
fun MainScreen() {
    var currentRoute by remember { 
        mutableStateOf(NavigationItem.Home.route) 
    }
    
    if (currentRoute.isEmpty()) {
        currentRoute = NavigationItem.Home.route
    }
    
    Scaffold(
        bottomBar = {
            val navigationItems = getOrderedNavigationItems()
            AnimatedBottomBar(
                items = navigationItems,
                currentRoute = currentRoute,
                onItemClick = { item ->
                    currentRoute = item.route
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (currentRoute) {
                NavigationItem.Home.route -> HomeScreen()
                NavigationItem.Search.route -> SearchScreen()
                NavigationItem.Favorites.route -> FavoritesScreen()
                NavigationItem.Profile.route -> ProfileScreen()
                NavigationItem.Settings.route -> SettingsScreen()
                else -> HomeScreen()
            }
        }
    }
}
