package com.unkindlie.lifetool.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.unkindlie.lifetool.presentation.components.generic.AppBottomNavBar

@Composable
fun MainScaffold() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { AppBottomNavBar() },
        modifier = Modifier.fillMaxSize()
    ) { it ->
        Box(modifier = Modifier.padding(it)) {
            Text("Hello")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    CenterAlignedTopAppBar(
        title = { Text("How") },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }
    )
}