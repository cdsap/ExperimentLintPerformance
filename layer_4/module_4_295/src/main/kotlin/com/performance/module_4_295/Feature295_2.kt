package com.performance.module_4_295

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
import com.performance.module_4_295.R
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_243.Feature243ViewModel
import com.performance.module_3_249.Feature249ViewModel
import com.performance.module_3_262.Feature262ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_251.Feature251ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_252.Feature252ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_254.Feature254ViewModel

class Feature295Activity : ComponentActivity() {
    private lateinit var viewModel: Feature295ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature295Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature295ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature295Screen() {
    Text(
        text = "Feature 295",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature295ScreenPreview() {
    MaterialTheme {
        Feature295Screen()
    }
}
