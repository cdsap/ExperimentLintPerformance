package com.performance.module_2_145

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
import com.performance.module_2_145.R
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_106.Feature106ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_127.Feature127ViewModel

class Feature145Activity : ComponentActivity() {
    private lateinit var viewModel: Feature145ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature145Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature145ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature145Screen() {
    Text(
        text = "Feature 145",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature145ScreenPreview() {
    MaterialTheme {
        Feature145Screen()
    }
}
