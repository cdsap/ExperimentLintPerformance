package com.performance.module_4_276

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
import com.performance.module_4_276.R
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_245.Feature245ViewModel
import com.performance.module_3_268.Feature268ViewModel
import com.performance.module_3_270.Feature270ViewModel

class Feature276Activity : ComponentActivity() {
    private lateinit var viewModel: Feature276ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature276Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature276ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature276Screen() {
    Text(
        text = "Feature 276",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature276ScreenPreview() {
    MaterialTheme {
        Feature276Screen()
    }
}
