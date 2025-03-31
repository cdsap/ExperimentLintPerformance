package com.performance.module_1_102

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
import com.performance.module_1_102.R
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_41.Feature41ViewModel

class Feature102Activity : ComponentActivity() {
    private lateinit var viewModel: Feature102ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature102Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature102ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature102Screen() {
    Text(
        text = "Feature 102",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature102ScreenPreview() {
    MaterialTheme {
        Feature102Screen()
    }
}
