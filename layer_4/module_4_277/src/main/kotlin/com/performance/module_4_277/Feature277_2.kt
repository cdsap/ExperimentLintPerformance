package com.performance.module_4_277

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
import com.performance.module_4_277.R
import com.performance.module_3_262.Feature262ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_247.Feature247ViewModel

class Feature277Activity : ComponentActivity() {
    private lateinit var viewModel: Feature277ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature277Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature277ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature277Screen() {
    Text(
        text = "Feature 277",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature277ScreenPreview() {
    MaterialTheme {
        Feature277Screen()
    }
}
