package com.performance.module_4_292

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
import com.performance.module_4_292.R
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_267.Feature267ViewModel
import com.performance.module_3_246.Feature246ViewModel

class Feature292Activity : ComponentActivity() {
    private lateinit var viewModel: Feature292ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature292Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature292ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature292Screen() {
    Text(
        text = "Feature 292",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature292ScreenPreview() {
    MaterialTheme {
        Feature292Screen()
    }
}
