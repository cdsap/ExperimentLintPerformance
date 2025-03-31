package com.performance.module_2_209

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
import com.performance.module_2_209.R
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_159.Feature159ViewModel

class Feature209Activity : ComponentActivity() {
    private lateinit var viewModel: Feature209ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature209Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature209ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature209Screen() {
    Text(
        text = "Feature 209",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature209ScreenPreview() {
    MaterialTheme {
        Feature209Screen()
    }
}
