package com.performance.module_0_48

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
import com.performance.module_0_48.R

class Feature48Activity : ComponentActivity() {
    private lateinit var viewModel: Feature48ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature48Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature48ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature48Screen() {
    Text(
        text = "Feature 48",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature48ScreenPreview() {
    MaterialTheme {
        Feature48Screen()
    }
}
