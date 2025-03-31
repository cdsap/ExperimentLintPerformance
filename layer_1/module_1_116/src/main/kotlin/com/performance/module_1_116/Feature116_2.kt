package com.performance.module_1_116

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
import com.performance.module_1_116.R
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_29.Feature29ViewModel

class Feature116Activity : ComponentActivity() {
    private lateinit var viewModel: Feature116ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature116Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature116ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature116Screen() {
    Text(
        text = "Feature 116",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature116ScreenPreview() {
    MaterialTheme {
        Feature116Screen()
    }
}
