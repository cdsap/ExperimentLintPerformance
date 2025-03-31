package com.performance.module_1_150

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
import com.performance.module_1_150.R
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_68.Feature68ViewModel

class Feature150Activity : ComponentActivity() {
    private lateinit var viewModel: Feature150ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature150Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature150ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature150Screen() {
    Text(
        text = "Feature 150",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature150ScreenPreview() {
    MaterialTheme {
        Feature150Screen()
    }
}
