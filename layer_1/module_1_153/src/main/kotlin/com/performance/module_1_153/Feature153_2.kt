package com.performance.module_1_153

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
import com.performance.module_1_153.R
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_113.Feature113ViewModel

class Feature153Activity : ComponentActivity() {
    private lateinit var viewModel: Feature153ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature153Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature153ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature153Screen() {
    Text(
        text = "Feature 153",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature153ScreenPreview() {
    MaterialTheme {
        Feature153Screen()
    }
}
