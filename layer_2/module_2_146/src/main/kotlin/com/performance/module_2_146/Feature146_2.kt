package com.performance.module_2_146

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
import com.performance.module_2_146.R
import com.performance.module_1_120.Feature120ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_109.Feature109ViewModel

class Feature146Activity : ComponentActivity() {
    private lateinit var viewModel: Feature146ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature146Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature146ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature146Screen() {
    Text(
        text = "Feature 146",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature146ScreenPreview() {
    MaterialTheme {
        Feature146Screen()
    }
}
