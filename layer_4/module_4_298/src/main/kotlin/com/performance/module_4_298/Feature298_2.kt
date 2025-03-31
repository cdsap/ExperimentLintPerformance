package com.performance.module_4_298

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
import com.performance.module_4_298.R
import com.performance.module_3_249.Feature249ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_245.Feature245ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_255.Feature255ViewModel
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_273.Feature273ViewModel
import com.performance.module_3_266.Feature266ViewModel

class Feature298Activity : ComponentActivity() {
    private lateinit var viewModel: Feature298ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature298Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature298ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature298Screen() {
    Text(
        text = "Feature 298",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature298ScreenPreview() {
    MaterialTheme {
        Feature298Screen()
    }
}
