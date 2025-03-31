package com.performance.module_1_29

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
import com.performance.module_1_29.R
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_3.Feature3ViewModel

class Feature29Activity : ComponentActivity() {
    private lateinit var viewModel: Feature29ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature29Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature29ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature29Screen() {
    Text(
        text = "Feature 29",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature29ScreenPreview() {
    MaterialTheme {
        Feature29Screen()
    }
}
