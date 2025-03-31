package com.performance.module_1_19

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
import com.performance.module_1_19.R
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_2.Feature2ViewModel

class Feature19Activity : ComponentActivity() {
    private lateinit var viewModel: Feature19ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature19Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature19ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature19Screen() {
    Text(
        text = "Feature 19",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature19ScreenPreview() {
    MaterialTheme {
        Feature19Screen()
    }
}
