package com.performance.module_1_136

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
import com.performance.module_1_136.R
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_18.Feature18ViewModel

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
