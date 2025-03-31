package com.performance.module_1_45

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
import com.performance.module_1_45.R
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_8.Feature8ViewModel

class Feature45Activity : ComponentActivity() {
    private lateinit var viewModel: Feature45ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature45Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature45ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature45Screen() {
    Text(
        text = "Feature 45",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature45ScreenPreview() {
    MaterialTheme {
        Feature45Screen()
    }
}
