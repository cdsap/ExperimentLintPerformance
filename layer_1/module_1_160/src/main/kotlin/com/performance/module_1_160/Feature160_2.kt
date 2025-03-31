package com.performance.module_1_160

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
import com.performance.module_1_160.R
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_36.Feature36ViewModel

class Feature160Activity : ComponentActivity() {
    private lateinit var viewModel: Feature160ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature160Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature160ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature160Screen() {
    Text(
        text = "Feature 160",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature160ScreenPreview() {
    MaterialTheme {
        Feature160Screen()
    }
}
