package com.performance.module_3_267

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
import com.performance.module_3_267.R
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_230.Feature230ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_216.Feature216ViewModel
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_229.Feature229ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_213.Feature213ViewModel

class Feature267Activity : ComponentActivity() {
    private lateinit var viewModel: Feature267ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature267Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature267ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature267Screen() {
    Text(
        text = "Feature 267",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature267ScreenPreview() {
    MaterialTheme {
        Feature267Screen()
    }
}
