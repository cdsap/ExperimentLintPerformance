package com.performance.module_4_186

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
import com.performance.module_4_186.R
import com.performance.module_3_168.Feature168ViewModel
import com.performance.module_3_177.Feature177ViewModel

class Feature186Activity : ComponentActivity() {
    private lateinit var viewModel: Feature186ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature186Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature186ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature186Screen() {
    Text(
        text = "Feature 186",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature186ScreenPreview() {
    MaterialTheme {
        Feature186Screen()
    }
}
