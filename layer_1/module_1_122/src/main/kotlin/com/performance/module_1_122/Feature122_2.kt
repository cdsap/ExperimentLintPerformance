package com.performance.module_1_122

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
import com.performance.module_1_122.R
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_9.Feature9ViewModel

class Feature122Activity : ComponentActivity() {
    private lateinit var viewModel: Feature122ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature122Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature122ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature122Screen() {
    Text(
        text = "Feature 122",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature122ScreenPreview() {
    MaterialTheme {
        Feature122Screen()
    }
}
