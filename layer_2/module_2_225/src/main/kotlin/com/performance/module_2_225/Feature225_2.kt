package com.performance.module_2_225

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
import com.performance.module_2_225.R
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_168.Feature168ViewModel

class Feature225Activity : ComponentActivity() {
    private lateinit var viewModel: Feature225ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature225Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature225ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature225Screen() {
    Text(
        text = "Feature 225",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature225ScreenPreview() {
    MaterialTheme {
        Feature225Screen()
    }
}
