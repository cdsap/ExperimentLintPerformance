package com.performance.module_4_275

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
import com.performance.module_4_275.R
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_260.Feature260ViewModel

class Feature275Activity : ComponentActivity() {
    private lateinit var viewModel: Feature275ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature275Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature275ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature275Screen() {
    Text(
        text = "Feature 275",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature275ScreenPreview() {
    MaterialTheme {
        Feature275Screen()
    }
}
