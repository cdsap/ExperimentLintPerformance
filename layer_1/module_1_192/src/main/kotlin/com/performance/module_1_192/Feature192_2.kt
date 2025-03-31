package com.performance.module_1_192

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
import com.performance.module_1_192.R
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_117.Feature117ViewModel

class Feature192Activity : ComponentActivity() {
    private lateinit var viewModel: Feature192ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature192Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature192ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature192Screen() {
    Text(
        text = "Feature 192",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature192ScreenPreview() {
    MaterialTheme {
        Feature192Screen()
    }
}
