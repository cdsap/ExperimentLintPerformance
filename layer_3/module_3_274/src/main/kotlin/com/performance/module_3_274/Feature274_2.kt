package com.performance.module_3_274

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
import com.performance.module_3_274.R
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_216.Feature216ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_235.Feature235ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_220.Feature220ViewModel

class Feature274Activity : ComponentActivity() {
    private lateinit var viewModel: Feature274ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature274Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature274ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature274Screen() {
    Text(
        text = "Feature 274",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature274ScreenPreview() {
    MaterialTheme {
        Feature274Screen()
    }
}
