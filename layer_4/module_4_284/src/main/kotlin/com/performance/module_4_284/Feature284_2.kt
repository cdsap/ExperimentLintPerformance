package com.performance.module_4_284

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
import com.performance.module_4_284.R
import com.performance.module_3_262.Feature262ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_245.Feature245ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_250.Feature250ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_257.Feature257ViewModel

class Feature284Activity : ComponentActivity() {
    private lateinit var viewModel: Feature284ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature284Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature284ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature284Screen() {
    Text(
        text = "Feature 284",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature284ScreenPreview() {
    MaterialTheme {
        Feature284Screen()
    }
}
