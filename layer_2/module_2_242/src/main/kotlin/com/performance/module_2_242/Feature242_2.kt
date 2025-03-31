package com.performance.module_2_242

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
import com.performance.module_2_242.R
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_142.Feature142ViewModel

class Feature242Activity : ComponentActivity() {
    private lateinit var viewModel: Feature242ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature242Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature242ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature242Screen() {
    Text(
        text = "Feature 242",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature242ScreenPreview() {
    MaterialTheme {
        Feature242Screen()
    }
}
