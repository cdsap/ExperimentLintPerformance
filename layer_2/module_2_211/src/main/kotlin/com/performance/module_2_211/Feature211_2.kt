package com.performance.module_2_211

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
import com.performance.module_2_211.R
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_146.Feature146ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_135.Feature135ViewModel
import com.performance.module_1_190.Feature190ViewModel

class Feature211Activity : ComponentActivity() {
    private lateinit var viewModel: Feature211ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature211Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature211ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature211Screen() {
    Text(
        text = "Feature 211",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature211ScreenPreview() {
    MaterialTheme {
        Feature211Screen()
    }
}
