package com.performance.module_4_188

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
import com.performance.module_4_188.R
import com.performance.module_3_163.Feature163ViewModel
import com.performance.module_3_175.Feature175ViewModel
import com.performance.module_3_166.Feature166ViewModel
import com.performance.module_3_168.Feature168ViewModel
import com.performance.module_3_178.Feature178ViewModel
import com.performance.module_3_167.Feature167ViewModel
import com.performance.module_3_182.Feature182ViewModel
import com.performance.module_3_164.Feature164ViewModel

class Feature188Activity : ComponentActivity() {
    private lateinit var viewModel: Feature188ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature188Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature188ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature188Screen() {
    Text(
        text = "Feature 188",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature188ScreenPreview() {
    MaterialTheme {
        Feature188Screen()
    }
}
