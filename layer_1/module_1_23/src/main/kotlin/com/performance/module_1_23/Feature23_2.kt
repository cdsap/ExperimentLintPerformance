package com.performance.module_1_23

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
import com.performance.module_1_23.R
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_13.Feature13ViewModel

class Feature23Activity : ComponentActivity() {
    private lateinit var viewModel: Feature23ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature23Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature23ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature23Screen() {
    Text(
        text = "Feature 23",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature23ScreenPreview() {
    MaterialTheme {
        Feature23Screen()
    }
}
