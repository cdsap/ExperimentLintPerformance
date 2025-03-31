package com.performance.module_1_132

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
import com.performance.module_1_132.R
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_60.Feature60ViewModel

class Feature132Activity : ComponentActivity() {
    private lateinit var viewModel: Feature132ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature132Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature132ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature132Screen() {
    Text(
        text = "Feature 132",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature132ScreenPreview() {
    MaterialTheme {
        Feature132Screen()
    }
}
