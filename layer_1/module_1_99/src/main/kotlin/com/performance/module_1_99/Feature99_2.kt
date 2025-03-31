package com.performance.module_1_99

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
import com.performance.module_1_99.R
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_19.Feature19ViewModel

class Feature99Activity : ComponentActivity() {
    private lateinit var viewModel: Feature99ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature99Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature99ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature99Screen() {
    Text(
        text = "Feature 99",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature99ScreenPreview() {
    MaterialTheme {
        Feature99Screen()
    }
}
