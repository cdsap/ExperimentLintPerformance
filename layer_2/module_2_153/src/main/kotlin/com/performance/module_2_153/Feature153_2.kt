package com.performance.module_2_153

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
import com.performance.module_2_153.R
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_91.Feature91ViewModel
import com.performance.module_1_115.Feature115ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_129.Feature129ViewModel

class Feature153Activity : ComponentActivity() {
    private lateinit var viewModel: Feature153ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature153Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature153ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature153Screen() {
    Text(
        text = "Feature 153",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature153ScreenPreview() {
    MaterialTheme {
        Feature153Screen()
    }
}
