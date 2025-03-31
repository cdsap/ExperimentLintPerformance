package com.performance.module_1_17

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
import com.performance.module_1_17.R
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_5.Feature5ViewModel

class Feature17Activity : ComponentActivity() {
    private lateinit var viewModel: Feature17ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature17Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature17ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature17Screen() {
    Text(
        text = "Feature 17",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature17ScreenPreview() {
    MaterialTheme {
        Feature17Screen()
    }
}
