// Ailyn Diaz
// 4/19/24
// CSC ANDROID ROOM EXAMPLE: DATABASE

package com.example.inventory.ui.navigation

interface NavigationDestination {
    /**
     * Unique name to define the path for a composable
     */
    val route: String

    /**
     * String resource id to that contains title to be displayed for the screen.
     */
    val titleRes: Int
}
