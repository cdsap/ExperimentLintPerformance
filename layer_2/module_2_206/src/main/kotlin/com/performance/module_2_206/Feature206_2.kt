package com.performance.module_2_206

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
import com.performance.module_2_206.R
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_134.Feature134ViewModel

class Feature206Activity : ComponentActivity() {
    private lateinit var viewModel: Feature206ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature206Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature206ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature206Screen() {
    Text(
        text = "Feature 206",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature206ScreenPreview() {
    MaterialTheme {
        Feature206Screen()
    }
}
