package com.performance.module_1_39

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
import com.performance.module_1_39.R
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_13.Feature13ViewModel

class Feature39Activity : ComponentActivity() {
    private lateinit var viewModel: Feature39ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature39Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature39ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature39Screen() {
    Text(
        text = "Feature 39",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature39ScreenPreview() {
    MaterialTheme {
        Feature39Screen()
    }
}
