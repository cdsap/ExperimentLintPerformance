package com.performance.module_1_196

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
import com.performance.module_1_196.R
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_5.Feature5ViewModel

class Feature196Activity : ComponentActivity() {
    private lateinit var viewModel: Feature196ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature196Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature196ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature196Screen() {
    Text(
        text = "Feature 196",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature196ScreenPreview() {
    MaterialTheme {
        Feature196Screen()
    }
}
