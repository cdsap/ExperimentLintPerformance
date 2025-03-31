package com.performance.module_1_128

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
import com.performance.module_1_128.R
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_47.Feature47ViewModel

class Feature128Activity : ComponentActivity() {
    private lateinit var viewModel: Feature128ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature128Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature128ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature128Screen() {
    Text(
        text = "Feature 128",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature128ScreenPreview() {
    MaterialTheme {
        Feature128Screen()
    }
}
