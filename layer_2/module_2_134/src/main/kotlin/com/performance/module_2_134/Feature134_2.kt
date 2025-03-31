package com.performance.module_2_134

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
import com.performance.module_2_134.R
import com.performance.module_1_91.Feature91ViewModel
import com.performance.module_1_106.Feature106ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_115.Feature115ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_120.Feature120ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_129.Feature129ViewModel
import com.performance.module_1_128.Feature128ViewModel

class Feature134Activity : ComponentActivity() {
    private lateinit var viewModel: Feature134ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature134Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature134ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature134Screen() {
    Text(
        text = "Feature 134",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature134ScreenPreview() {
    MaterialTheme {
        Feature134Screen()
    }
}
