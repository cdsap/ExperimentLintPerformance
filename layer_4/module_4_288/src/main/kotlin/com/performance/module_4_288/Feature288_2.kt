package com.performance.module_4_288

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
import com.performance.module_4_288.R
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_267.Feature267ViewModel
import com.performance.module_3_246.Feature246ViewModel

class Feature288Activity : ComponentActivity() {
    private lateinit var viewModel: Feature288ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature288Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature288ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature288Screen() {
    Text(
        text = "Feature 288",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature288ScreenPreview() {
    MaterialTheme {
        Feature288Screen()
    }
}
