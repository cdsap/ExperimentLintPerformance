package com.performance.module_1_119

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
import com.performance.module_1_119.R
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_87.Feature87ViewModel

class Feature119Activity : ComponentActivity() {
    private lateinit var viewModel: Feature119ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature119Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature119ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature119Screen() {
    Text(
        text = "Feature 119",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature119ScreenPreview() {
    MaterialTheme {
        Feature119Screen()
    }
}
