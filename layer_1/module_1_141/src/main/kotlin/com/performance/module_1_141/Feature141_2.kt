package com.performance.module_1_141

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
import com.performance.module_1_141.R
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_86.Feature86ViewModel

class Feature141Activity : ComponentActivity() {
    private lateinit var viewModel: Feature141ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature141Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature141ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature141Screen() {
    Text(
        text = "Feature 141",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature141ScreenPreview() {
    MaterialTheme {
        Feature141Screen()
    }
}
