package com.performance.module_2_237

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
import com.performance.module_2_237.R
import com.performance.module_1_157.Feature157ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_193.Feature193ViewModel

class Feature237Activity : ComponentActivity() {
    private lateinit var viewModel: Feature237ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature237Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature237ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature237Screen() {
    Text(
        text = "Feature 237",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature237ScreenPreview() {
    MaterialTheme {
        Feature237Screen()
    }
}
