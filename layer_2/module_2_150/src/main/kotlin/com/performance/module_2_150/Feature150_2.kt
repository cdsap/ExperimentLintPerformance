package com.performance.module_2_150

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
import com.performance.module_2_150.R
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_115.Feature115ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_96.Feature96ViewModel

class Feature150Activity : ComponentActivity() {
    private lateinit var viewModel: Feature150ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature150Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature150ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature150Screen() {
    Text(
        text = "Feature 150",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature150ScreenPreview() {
    MaterialTheme {
        Feature150Screen()
    }
}
