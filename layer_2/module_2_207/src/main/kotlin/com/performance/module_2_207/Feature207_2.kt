package com.performance.module_2_207

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
import com.performance.module_2_207.R
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_135.Feature135ViewModel
import com.performance.module_1_157.Feature157ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_179.Feature179ViewModel

class Feature207Activity : ComponentActivity() {
    private lateinit var viewModel: Feature207ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature207Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature207ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature207Screen() {
    Text(
        text = "Feature 207",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature207ScreenPreview() {
    MaterialTheme {
        Feature207Screen()
    }
}
