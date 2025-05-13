package com.unkindlie.lifetool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.unkindlie.lifetool.presentation.MainScaffold
import com.unkindlie.lifetool.ui.theme.LifeToolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeToolTheme {
                MainScaffold()
            }
        }
    }
}