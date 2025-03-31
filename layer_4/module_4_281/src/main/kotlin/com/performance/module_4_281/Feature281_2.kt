package com.performance.module_4_281

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
import com.performance.module_4_281.R
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_274.Feature274ViewModel
import com.performance.module_3_267.Feature267ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_257.Feature257ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_258.Feature258ViewModel

class Feature281Activity : ComponentActivity() {
    private lateinit var viewModel: Feature281ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature281Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature281ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature281Screen() {
    Text(
        text = "Feature 281",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature281ScreenPreview() {
    MaterialTheme {
        Feature281Screen()
    }
}
