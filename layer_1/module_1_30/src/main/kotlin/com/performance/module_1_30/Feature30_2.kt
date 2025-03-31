package com.performance.module_1_30

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
import com.performance.module_1_30.R
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_11.Feature11ViewModel

class Feature30Activity : ComponentActivity() {
    private lateinit var viewModel: Feature30ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature30Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature30ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature30Screen() {
    Text(
        text = "Feature 30",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature30ScreenPreview() {
    MaterialTheme {
        Feature30Screen()
    }
}
