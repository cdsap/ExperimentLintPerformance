package com.performance.module_2_162

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
import com.performance.module_2_162.R
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_102.Feature102ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_92.Feature92ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_113.Feature113ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_129.Feature129ViewModel

class Feature162Activity : ComponentActivity() {
    private lateinit var viewModel: Feature162ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature162Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature162ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature162Screen() {
    Text(
        text = "Feature 162",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature162ScreenPreview() {
    MaterialTheme {
        Feature162Screen()
    }
}
