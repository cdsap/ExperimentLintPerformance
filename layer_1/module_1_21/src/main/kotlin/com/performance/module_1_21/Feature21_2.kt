package com.performance.module_1_21

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
import com.performance.module_1_21.R
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_2.Feature2ViewModel

class Feature21Activity : ComponentActivity() {
    private lateinit var viewModel: Feature21ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature21Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature21ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature21Screen() {
    Text(
        text = "Feature 21",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature21ScreenPreview() {
    MaterialTheme {
        Feature21Screen()
    }
}
