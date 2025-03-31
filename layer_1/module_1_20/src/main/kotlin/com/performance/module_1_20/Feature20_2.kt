package com.performance.module_1_20

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
import com.performance.module_1_20.R
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_10.Feature10ViewModel

class Feature20Activity : ComponentActivity() {
    private lateinit var viewModel: Feature20ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature20Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature20ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature20Screen() {
    Text(
        text = "Feature 20",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature20ScreenPreview() {
    MaterialTheme {
        Feature20Screen()
    }
}
