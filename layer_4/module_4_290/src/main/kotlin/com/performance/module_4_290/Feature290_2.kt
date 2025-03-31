package com.performance.module_4_290

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
import com.performance.module_4_290.R
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_273.Feature273ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_254.Feature254ViewModel

class Feature290Activity : ComponentActivity() {
    private lateinit var viewModel: Feature290ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature290Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature290ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature290Screen() {
    Text(
        text = "Feature 290",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature290ScreenPreview() {
    MaterialTheme {
        Feature290Screen()
    }
}
