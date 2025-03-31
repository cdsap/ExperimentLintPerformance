package com.performance.module_1_93

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
import com.performance.module_1_93.R
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_57.Feature57ViewModel

class Feature93Activity : ComponentActivity() {
    private lateinit var viewModel: Feature93ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature93Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature93ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature93Screen() {
    Text(
        text = "Feature 93",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature93ScreenPreview() {
    MaterialTheme {
        Feature93Screen()
    }
}
