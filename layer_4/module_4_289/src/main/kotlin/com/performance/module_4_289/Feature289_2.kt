package com.performance.module_4_289

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
import com.performance.module_4_289.R
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_274.Feature274ViewModel

class Feature289Activity : ComponentActivity() {
    private lateinit var viewModel: Feature289ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature289Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature289ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature289Screen() {
    Text(
        text = "Feature 289",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature289ScreenPreview() {
    MaterialTheme {
        Feature289Screen()
    }
}
