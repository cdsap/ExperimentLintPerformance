package com.performance.module_2_137

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
import com.performance.module_2_137.R
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_97.Feature97ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_114.Feature114ViewModel
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_113.Feature113ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_120.Feature120ViewModel
import com.performance.module_1_101.Feature101ViewModel
import com.performance.module_1_121.Feature121ViewModel

class Feature137Activity : ComponentActivity() {
    private lateinit var viewModel: Feature137ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature137Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature137ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature137Screen() {
    Text(
        text = "Feature 137",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature137ScreenPreview() {
    MaterialTheme {
        Feature137Screen()
    }
}
