package com.performance.module_1_188

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
import com.performance.module_1_188.R
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_51.Feature51ViewModel

class Feature188Activity : ComponentActivity() {
    private lateinit var viewModel: Feature188ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature188Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature188ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature188Screen() {
    Text(
        text = "Feature 188",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature188ScreenPreview() {
    MaterialTheme {
        Feature188Screen()
    }
}
