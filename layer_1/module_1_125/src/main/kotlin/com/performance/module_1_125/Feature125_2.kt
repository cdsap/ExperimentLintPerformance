package com.performance.module_1_125

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
import com.performance.module_1_125.R
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_13.Feature13ViewModel

class Feature125Activity : ComponentActivity() {
    private lateinit var viewModel: Feature125ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature125Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature125ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature125Screen() {
    Text(
        text = "Feature 125",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature125ScreenPreview() {
    MaterialTheme {
        Feature125Screen()
    }
}
