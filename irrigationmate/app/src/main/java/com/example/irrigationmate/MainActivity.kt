package com.example.smartirrigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartirrigation.ui.theme.SmartIrrigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartIrrigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SmartIrrigationApp()
                }
            }
        }
    }
}

@Composable
fun SmartIrrigationApp() {
    // Call your main screen composable here
    Slashscreen() // Example: Start with the splash screen
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SmartIrrigationTheme {
        SmartIrrigationApp()
    }
}