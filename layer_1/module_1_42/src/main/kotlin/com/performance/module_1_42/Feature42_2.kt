package com.performance.module_1_42

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
import com.performance.module_1_42.R
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_12.Feature12ViewModel

class Feature42Activity : ComponentActivity() {
    private lateinit var viewModel: Feature42ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature42Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature42ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature42Screen() {
    Text(
        text = "Feature 42",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature42ScreenPreview() {
    MaterialTheme {
        Feature42Screen()
    }
}
