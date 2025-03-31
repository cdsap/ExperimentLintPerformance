package com.performance.module_2_241

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
import com.performance.module_2_241.R
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_193.Feature193ViewModel

class Feature241Activity : ComponentActivity() {
    private lateinit var viewModel: Feature241ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature241Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature241ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature241Screen() {
    Text(
        text = "Feature 241",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature241ScreenPreview() {
    MaterialTheme {
        Feature241Screen()
    }
}
