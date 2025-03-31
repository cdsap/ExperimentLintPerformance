package com.performance.module_2_221

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
import com.performance.module_2_221.R
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_171.Feature171ViewModel
import com.performance.module_1_135.Feature135ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_134.Feature134ViewModel

class Feature221Activity : ComponentActivity() {
    private lateinit var viewModel: Feature221ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature221Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature221ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature221Screen() {
    Text(
        text = "Feature 221",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature221ScreenPreview() {
    MaterialTheme {
        Feature221Screen()
    }
}
