package com.performance.module_1_104

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
import com.performance.module_1_104.R
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_10.Feature10ViewModel

class Feature104Activity : ComponentActivity() {
    private lateinit var viewModel: Feature104ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature104Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature104ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature104Screen() {
    Text(
        text = "Feature 104",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature104ScreenPreview() {
    MaterialTheme {
        Feature104Screen()
    }
}
