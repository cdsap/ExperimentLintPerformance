package com.performance.module_3_270

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
import com.performance.module_3_270.R
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_235.Feature235ViewModel
import com.performance.module_2_217.Feature217ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_230.Feature230ViewModel

class Feature270Activity : ComponentActivity() {
    private lateinit var viewModel: Feature270ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature270Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature270ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature270Screen() {
    Text(
        text = "Feature 270",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature270ScreenPreview() {
    MaterialTheme {
        Feature270Screen()
    }
}
