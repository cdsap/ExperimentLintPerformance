package com.performance.module_3_256

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
import com.performance.module_3_256.R
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_216.Feature216ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_225.Feature225ViewModel

class Feature256Activity : ComponentActivity() {
    private lateinit var viewModel: Feature256ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature256Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature256ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature256Screen() {
    Text(
        text = "Feature 256",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature256ScreenPreview() {
    MaterialTheme {
        Feature256Screen()
    }
}
