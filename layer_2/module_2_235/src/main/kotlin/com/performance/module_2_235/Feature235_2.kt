package com.performance.module_2_235

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
import com.performance.module_2_235.R
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_193.Feature193ViewModel

class Feature235Activity : ComponentActivity() {
    private lateinit var viewModel: Feature235ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature235Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature235ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature235Screen() {
    Text(
        text = "Feature 235",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature235ScreenPreview() {
    MaterialTheme {
        Feature235Screen()
    }
}
