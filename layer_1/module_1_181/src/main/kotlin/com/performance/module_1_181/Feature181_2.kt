package com.performance.module_1_181

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
import com.performance.module_1_181.R
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_52.Feature52ViewModel

class Feature181Activity : ComponentActivity() {
    private lateinit var viewModel: Feature181ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature181Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature181ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature181Screen() {
    Text(
        text = "Feature 181",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature181ScreenPreview() {
    MaterialTheme {
        Feature181Screen()
    }
}
