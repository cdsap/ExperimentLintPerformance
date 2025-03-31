package com.performance.module_3_252

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
import com.performance.module_3_252.R
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_240.Feature240ViewModel

class Feature252Activity : ComponentActivity() {
    private lateinit var viewModel: Feature252ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature252Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature252ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature252Screen() {
    Text(
        text = "Feature 252",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature252ScreenPreview() {
    MaterialTheme {
        Feature252Screen()
    }
}
