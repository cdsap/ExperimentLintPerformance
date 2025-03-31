package com.performance.module_1_129

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
import com.performance.module_1_129.R
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_69.Feature69ViewModel

class Feature129Activity : ComponentActivity() {
    private lateinit var viewModel: Feature129ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature129Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature129ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature129Screen() {
    Text(
        text = "Feature 129",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature129ScreenPreview() {
    MaterialTheme {
        Feature129Screen()
    }
}
