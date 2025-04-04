package com.performance.module_1_135

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
import com.performance.module_1_135.R
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_100.Feature100ViewModel

class Feature135Activity : ComponentActivity() {
    private lateinit var viewModel: Feature135ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature135Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature135ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature135Screen() {
    Text(
        text = "Feature 135",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature135ScreenPreview() {
    MaterialTheme {
        Feature135Screen()
    }
}
