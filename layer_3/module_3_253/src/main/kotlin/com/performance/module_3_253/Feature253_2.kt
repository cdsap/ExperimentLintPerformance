package com.performance.module_3_253

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
import com.performance.module_3_253.R
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_201.Feature201ViewModel

class Feature253Activity : ComponentActivity() {
    private lateinit var viewModel: Feature253ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature253Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature253ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature253Screen() {
    Text(
        text = "Feature 253",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature253ScreenPreview() {
    MaterialTheme {
        Feature253Screen()
    }
}
