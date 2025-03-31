package com.performance.module_2_138

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
import com.performance.module_2_138.R
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_91.Feature91ViewModel
import com.performance.module_1_96.Feature96ViewModel

class Feature138Activity : ComponentActivity() {
    private lateinit var viewModel: Feature138ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature138Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature138ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature138Screen() {
    Text(
        text = "Feature 138",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature138ScreenPreview() {
    MaterialTheme {
        Feature138Screen()
    }
}
