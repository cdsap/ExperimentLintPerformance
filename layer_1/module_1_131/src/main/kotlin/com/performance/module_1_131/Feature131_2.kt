package com.performance.module_1_131

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
import com.performance.module_1_131.R
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_64.Feature64ViewModel

class Feature131Activity : ComponentActivity() {
    private lateinit var viewModel: Feature131ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature131Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature131ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature131Screen() {
    Text(
        text = "Feature 131",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature131ScreenPreview() {
    MaterialTheme {
        Feature131Screen()
    }
}
