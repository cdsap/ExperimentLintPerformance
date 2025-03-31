package com.performance.module_1_189

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
import com.performance.module_1_189.R
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_119.Feature119ViewModel

class Feature189Activity : ComponentActivity() {
    private lateinit var viewModel: Feature189ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature189Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature189ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature189Screen() {
    Text(
        text = "Feature 189",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature189ScreenPreview() {
    MaterialTheme {
        Feature189Screen()
    }
}
