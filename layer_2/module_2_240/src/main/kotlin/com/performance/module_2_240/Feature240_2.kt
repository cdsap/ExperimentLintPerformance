package com.performance.module_2_240

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
import com.performance.module_2_240.R
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_157.Feature157ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_166.Feature166ViewModel

class Feature240Activity : ComponentActivity() {
    private lateinit var viewModel: Feature240ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature240Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature240ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature240Screen() {
    Text(
        text = "Feature 240",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature240ScreenPreview() {
    MaterialTheme {
        Feature240Screen()
    }
}
