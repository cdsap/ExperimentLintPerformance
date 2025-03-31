package com.performance.module_4_297

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
import com.performance.module_4_297.R
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_243.Feature243ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_262.Feature262ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_255.Feature255ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_245.Feature245ViewModel

class Feature297Activity : ComponentActivity() {
    private lateinit var viewModel: Feature297ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature297Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature297ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature297Screen() {
    Text(
        text = "Feature 297",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature297ScreenPreview() {
    MaterialTheme {
        Feature297Screen()
    }
}
