package com.performance.module_3_249

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
import com.performance.module_3_249.R
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_232.Feature232ViewModel

class Feature249Activity : ComponentActivity() {
    private lateinit var viewModel: Feature249ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature249Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature249ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature249Screen() {
    Text(
        text = "Feature 249",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature249ScreenPreview() {
    MaterialTheme {
        Feature249Screen()
    }
}
