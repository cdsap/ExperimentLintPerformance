package com.performance.module_1_16

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
import com.performance.module_1_16.R
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_7.Feature7ViewModel

class Feature16Activity : ComponentActivity() {
    private lateinit var viewModel: Feature16ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature16Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature16ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature16Screen() {
    Text(
        text = "Feature 16",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature16ScreenPreview() {
    MaterialTheme {
        Feature16Screen()
    }
}
