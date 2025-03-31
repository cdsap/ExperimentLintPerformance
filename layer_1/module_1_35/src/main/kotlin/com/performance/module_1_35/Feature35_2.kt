package com.performance.module_1_35

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
import com.performance.module_1_35.R
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_13.Feature13ViewModel

class Feature35Activity : ComponentActivity() {
    private lateinit var viewModel: Feature35ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature35Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature35ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature35Screen() {
    Text(
        text = "Feature 35",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature35ScreenPreview() {
    MaterialTheme {
        Feature35Screen()
    }
}
