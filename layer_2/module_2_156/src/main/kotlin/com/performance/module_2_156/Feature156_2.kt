package com.performance.module_2_156

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
import com.performance.module_2_156.R
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_96.Feature96ViewModel

class Feature156Activity : ComponentActivity() {
    private lateinit var viewModel: Feature156ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature156Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature156ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature156Screen() {
    Text(
        text = "Feature 156",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature156ScreenPreview() {
    MaterialTheme {
        Feature156Screen()
    }
}
