package com.performance.module_1_46

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
import com.performance.module_1_46.R
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_14.Feature14ViewModel

class Feature46Activity : ComponentActivity() {
    private lateinit var viewModel: Feature46ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature46Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature46ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature46Screen() {
    Text(
        text = "Feature 46",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature46ScreenPreview() {
    MaterialTheme {
        Feature46Screen()
    }
}
