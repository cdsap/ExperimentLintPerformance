package com.performance.module_4_287

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
import com.performance.module_4_287.R
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_274.Feature274ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_250.Feature250ViewModel
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_245.Feature245ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_257.Feature257ViewModel
import com.performance.module_3_243.Feature243ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_255.Feature255ViewModel

class Feature287Activity : ComponentActivity() {
    private lateinit var viewModel: Feature287ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature287Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature287ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature287Screen() {
    Text(
        text = "Feature 287",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature287ScreenPreview() {
    MaterialTheme {
        Feature287Screen()
    }
}
