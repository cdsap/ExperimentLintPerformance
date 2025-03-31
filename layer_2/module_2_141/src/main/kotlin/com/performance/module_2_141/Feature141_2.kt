package com.performance.module_2_141

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
import com.performance.module_2_141.R
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_113.Feature113ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_95.Feature95ViewModel

class Feature141Activity : ComponentActivity() {
    private lateinit var viewModel: Feature141ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature141Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature141ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature141Screen() {
    Text(
        text = "Feature 141",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature141ScreenPreview() {
    MaterialTheme {
        Feature141Screen()
    }
}
