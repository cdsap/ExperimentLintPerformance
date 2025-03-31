package com.performance.module_1_177

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
import com.performance.module_1_177.R
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_45.Feature45ViewModel

class Feature177Activity : ComponentActivity() {
    private lateinit var viewModel: Feature177ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature177Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature177ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature177Screen() {
    Text(
        text = "Feature 177",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature177ScreenPreview() {
    MaterialTheme {
        Feature177Screen()
    }
}
