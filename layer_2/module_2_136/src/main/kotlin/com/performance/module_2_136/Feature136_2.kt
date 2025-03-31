package com.performance.module_2_136

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
import com.performance.module_2_136.R
import com.performance.module_1_117.Feature117ViewModel
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_119.Feature119ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_97.Feature97ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_114.Feature114ViewModel
import com.performance.module_1_129.Feature129ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_102.Feature102ViewModel

class Feature136Activity : ComponentActivity() {
    private lateinit var viewModel: Feature136ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature136Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature136ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature136Screen() {
    Text(
        text = "Feature 136",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature136ScreenPreview() {
    MaterialTheme {
        Feature136Screen()
    }
}
