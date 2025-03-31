package com.performance.module_3_255

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
import com.performance.module_3_255.R
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_221.Feature221ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_229.Feature229ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_222.Feature222ViewModel

class Feature255Activity : ComponentActivity() {
    private lateinit var viewModel: Feature255ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature255Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature255ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature255Screen() {
    Text(
        text = "Feature 255",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature255ScreenPreview() {
    MaterialTheme {
        Feature255Screen()
    }
}
