package com.performance.module_3_170

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
import com.performance.module_3_170.R
import com.performance.module_2_145.Feature145ViewModel
import com.performance.module_2_160.Feature160ViewModel
import com.performance.module_2_154.Feature154ViewModel
import com.performance.module_2_157.Feature157ViewModel
import com.performance.module_2_138.Feature138ViewModel
import com.performance.module_2_144.Feature144ViewModel
import com.performance.module_2_162.Feature162ViewModel
import com.performance.module_2_153.Feature153ViewModel

class Feature170Activity : ComponentActivity() {
    private lateinit var viewModel: Feature170ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature170Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature170ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature170Screen() {
    Text(
        text = "Feature 170",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature170ScreenPreview() {
    MaterialTheme {
        Feature170Screen()
    }
}
