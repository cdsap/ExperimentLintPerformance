package com.performance.module_1_123

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
import com.performance.module_1_123.R
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_25.Feature25ViewModel

class Feature123Activity : ComponentActivity() {
    private lateinit var viewModel: Feature123ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature123Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature123ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature123Screen() {
    Text(
        text = "Feature 123",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature123ScreenPreview() {
    MaterialTheme {
        Feature123Screen()
    }
}
