package com.performance.module_1_27

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
import com.performance.module_1_27.R
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_5.Feature5ViewModel

class Feature27Activity : ComponentActivity() {
    private lateinit var viewModel: Feature27ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature27Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature27ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature27Screen() {
    Text(
        text = "Feature 27",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature27ScreenPreview() {
    MaterialTheme {
        Feature27Screen()
    }
}
