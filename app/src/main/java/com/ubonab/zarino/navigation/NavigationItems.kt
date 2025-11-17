package com.ubonab.zarino.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.ubonab.zarino.R

sealed class NavigationItem(
    val route: String,
    val title: Int,
    val icon: ImageVector
) {
    object Home : NavigationItem(
        route = "home",
        title = R.string.home,
        icon = Icons.Filled.Home
    )

    object Search : NavigationItem(
        route = "search",
        title = R.string.search,
        icon = Icons.Filled.Search
    )

    object Favorites : NavigationItem(
        route = "favorites",
        title = R.string.favorites,
        icon = Icons.Filled.Favorite
    )

    object Profile : NavigationItem(
        route = "profile",
        title = R.string.profile,
        icon = Icons.Filled.Person
    )

    object Settings : NavigationItem(
        route = "settings",
        title = R.string.settings,
        icon = Icons.Filled.Settings
    )

    companion object {
        val items = listOf(
            Home,
            Search,
            Favorites,
            Profile,
            Settings
        )
        
        init {
            if (!items.contains(Home)) {
                throw IllegalStateException("Home navigation item is missing from the navigation items list")
            }
        }
    }
}

fun getOrderedNavigationItems(): List<NavigationItem> {
    return listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Favorites,
        NavigationItem.Profile,
        NavigationItem.Settings
    )
}
