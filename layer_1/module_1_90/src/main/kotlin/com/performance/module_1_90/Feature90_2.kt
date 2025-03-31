package com.performance.module_1_90

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
import com.performance.module_1_90.R
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_39.Feature39ViewModel

class Feature90Activity : ComponentActivity() {
    private lateinit var viewModel: Feature90ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature90Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature90ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature90Screen() {
    Text(
        text = "Feature 90",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature90ScreenPreview() {
    MaterialTheme {
        Feature90Screen()
    }
}
