package com.performance.module_2_236

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
import com.performance.module_2_236.R
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_170.Feature170ViewModel

class Feature236Activity : ComponentActivity() {
    private lateinit var viewModel: Feature236ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature236Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature236ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature236Screen() {
    Text(
        text = "Feature 236",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature236ScreenPreview() {
    MaterialTheme {
        Feature236Screen()
    }
}
