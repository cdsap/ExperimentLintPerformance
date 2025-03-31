package com.performance.module_2_204

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
import com.performance.module_2_204.R
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_183.Feature183ViewModel

class Feature204Activity : ComponentActivity() {
    private lateinit var viewModel: Feature204ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature204Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature204ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature204Screen() {
    Text(
        text = "Feature 204",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature204ScreenPreview() {
    MaterialTheme {
        Feature204Screen()
    }
}
