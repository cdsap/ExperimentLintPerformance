package com.performance.module_0_14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.performance.module_0_14.R

class Feature14Activity : ComponentActivity() {
    private lateinit var viewModel: Feature14ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature14Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature14ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature14Screen() {
    Text(
        text = "Feature 14",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature14ScreenPreview() {
    MaterialTheme {
        Feature14Screen()
    }
}
