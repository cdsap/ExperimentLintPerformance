package com.performance.module_4_283

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
import com.performance.module_4_283.R
import com.performance.module_3_274.Feature274ViewModel
import com.performance.module_3_265.Feature265ViewModel

class Feature283Activity : ComponentActivity() {
    private lateinit var viewModel: Feature283ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature283Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature283ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature283Screen() {
    Text(
        text = "Feature 283",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature283ScreenPreview() {
    MaterialTheme {
        Feature283Screen()
    }
}
