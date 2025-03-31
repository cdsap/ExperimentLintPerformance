package com.performance.module_1_96

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
import com.performance.module_1_96.R
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_55.Feature55ViewModel

class Feature96Activity : ComponentActivity() {
    private lateinit var viewModel: Feature96ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature96Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature96ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature96Screen() {
    Text(
        text = "Feature 96",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature96ScreenPreview() {
    MaterialTheme {
        Feature96Screen()
    }
}
