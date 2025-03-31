package com.performance.module_3_246

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
import com.performance.module_3_246.R
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_230.Feature230ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_215.Feature215ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_214.Feature214ViewModel

class Feature246Activity : ComponentActivity() {
    private lateinit var viewModel: Feature246ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature246Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature246ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature246Screen() {
    Text(
        text = "Feature 246",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature246ScreenPreview() {
    MaterialTheme {
        Feature246Screen()
    }
}
