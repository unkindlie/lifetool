package com.unkindlie.lifetool.presentation.components.generic

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector

// TODO: add localization
enum class NavBarItems(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    QUESTS("Quests", Icons.AutoMirrored.Filled.List, Icons.AutoMirrored.Filled.List),
    SETTINGS("Settings", Icons.Filled.Settings, Icons.Outlined.Settings)
}

@Composable
fun AppBottomNavBar() {
    var selectedIndex by rememberSaveable { mutableIntStateOf(0) }
    val items = enumValues<NavBarItems>()

    NavigationBar {
        items.map { it -> NavigationBarItem(
            icon = {
                Icon(
                    imageVector = if (items.indexOf(it) == selectedIndex) it.selectedIcon
                        else it.unselectedIcon,
                    contentDescription = it.label,
                )
            },
            label = { Text(it.label) },
            selected = items.indexOf(it) == selectedIndex,
            onClick = { selectedIndex = items.indexOf(it) }
        ) }
    }
}