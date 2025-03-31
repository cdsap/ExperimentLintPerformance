package com.performance.module_1_31

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
import com.performance.module_1_31.R
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_2.Feature2ViewModel

class Feature31Activity : ComponentActivity() {
    private lateinit var viewModel: Feature31ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature31Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature31ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature31Screen() {
    Text(
        text = "Feature 31",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature31ScreenPreview() {
    MaterialTheme {
        Feature31Screen()
    }
}
