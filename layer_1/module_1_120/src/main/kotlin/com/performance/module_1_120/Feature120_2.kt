package com.performance.module_1_120

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
import com.performance.module_1_120.R
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_29.Feature29ViewModel

class Feature120Activity : ComponentActivity() {
    private lateinit var viewModel: Feature120ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature120Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature120ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature120Screen() {
    Text(
        text = "Feature 120",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature120ScreenPreview() {
    MaterialTheme {
        Feature120Screen()
    }
}
