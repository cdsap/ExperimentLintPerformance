package com.performance.module_1_165

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
import com.performance.module_1_165.R
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_116.Feature116ViewModel

class Feature165Activity : ComponentActivity() {
    private lateinit var viewModel: Feature165ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature165Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature165ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature165Screen() {
    Text(
        text = "Feature 165",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature165ScreenPreview() {
    MaterialTheme {
        Feature165Screen()
    }
}
