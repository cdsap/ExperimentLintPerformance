package com.performance.module_1_121

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
import com.performance.module_1_121.R
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_88.Feature88ViewModel

class Feature121Activity : ComponentActivity() {
    private lateinit var viewModel: Feature121ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature121Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature121ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature121Screen() {
    Text(
        text = "Feature 121",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature121ScreenPreview() {
    MaterialTheme {
        Feature121Screen()
    }
}
