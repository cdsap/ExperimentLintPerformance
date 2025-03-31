package com.performance.module_4_280

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
import com.performance.module_4_280.R
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_258.Feature258ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_262.Feature262ViewModel

class Feature280Activity : ComponentActivity() {
    private lateinit var viewModel: Feature280ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature280Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature280ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature280Screen() {
    Text(
        text = "Feature 280",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature280ScreenPreview() {
    MaterialTheme {
        Feature280Screen()
    }
}
