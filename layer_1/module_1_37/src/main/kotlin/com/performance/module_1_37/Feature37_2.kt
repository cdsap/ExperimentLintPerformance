package com.performance.module_1_37

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
import com.performance.module_1_37.R
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_11.Feature11ViewModel

class Feature37Activity : ComponentActivity() {
    private lateinit var viewModel: Feature37ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature37Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature37ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature37Screen() {
    Text(
        text = "Feature 37",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature37ScreenPreview() {
    MaterialTheme {
        Feature37Screen()
    }
}
