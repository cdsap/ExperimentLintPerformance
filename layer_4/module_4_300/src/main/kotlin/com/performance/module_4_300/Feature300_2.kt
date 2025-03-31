package com.performance.module_4_300

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
import com.performance.module_4_300.R
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_273.Feature273ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_243.Feature243ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_269.Feature269ViewModel

class Feature300Activity : ComponentActivity() {
    private lateinit var viewModel: Feature300ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature300Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature300ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature300Screen() {
    Text(
        text = "Feature 300",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature300ScreenPreview() {
    MaterialTheme {
        Feature300Screen()
    }
}
