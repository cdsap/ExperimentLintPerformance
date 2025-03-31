package com.performance.module_2_223

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
import com.performance.module_2_223.R
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_145.Feature145ViewModel
import com.performance.module_1_197.Feature197ViewModel

class Feature223Activity : ComponentActivity() {
    private lateinit var viewModel: Feature223ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature223Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature223ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature223Screen() {
    Text(
        text = "Feature 223",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature223ScreenPreview() {
    MaterialTheme {
        Feature223Screen()
    }
}
