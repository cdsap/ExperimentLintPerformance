package com.performance.module_2_232

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
import com.performance.module_2_232.R
import com.performance.module_1_145.Feature145ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_146.Feature146ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_181.Feature181ViewModel

class Feature232Activity : ComponentActivity() {
    private lateinit var viewModel: Feature232ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature232Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature232ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature232Screen() {
    Text(
        text = "Feature 232",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature232ScreenPreview() {
    MaterialTheme {
        Feature232Screen()
    }
}
