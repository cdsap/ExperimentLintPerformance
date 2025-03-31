package com.performance.module_2_201

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
import com.performance.module_2_201.R
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_150.Feature150ViewModel

class Feature201Activity : ComponentActivity() {
    private lateinit var viewModel: Feature201ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature201Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature201ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature201Screen() {
    Text(
        text = "Feature 201",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature201ScreenPreview() {
    MaterialTheme {
        Feature201Screen()
    }
}
