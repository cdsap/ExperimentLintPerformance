package com.performance.module_3_183

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
import com.performance.module_3_183.R
import com.performance.module_2_155.Feature155ViewModel
import com.performance.module_2_149.Feature149ViewModel

class Feature183Activity : ComponentActivity() {
    private lateinit var viewModel: Feature183ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature183Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature183ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature183Screen() {
    Text(
        text = "Feature 183",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature183ScreenPreview() {
    MaterialTheme {
        Feature183Screen()
    }
}
