package com.performance.module_1_144

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
import com.performance.module_1_144.R
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_61.Feature61ViewModel

class Feature144Activity : ComponentActivity() {
    private lateinit var viewModel: Feature144ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature144Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature144ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature144Screen() {
    Text(
        text = "Feature 144",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature144ScreenPreview() {
    MaterialTheme {
        Feature144Screen()
    }
}
