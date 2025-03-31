package com.performance.module_4_279

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
import com.performance.module_4_279.R
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_250.Feature250ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_249.Feature249ViewModel
import com.performance.module_3_245.Feature245ViewModel
import com.performance.module_3_253.Feature253ViewModel

class Feature279Activity : ComponentActivity() {
    private lateinit var viewModel: Feature279ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature279Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature279ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature279Screen() {
    Text(
        text = "Feature 279",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature279ScreenPreview() {
    MaterialTheme {
        Feature279Screen()
    }
}
