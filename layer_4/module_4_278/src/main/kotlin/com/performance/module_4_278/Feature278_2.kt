package com.performance.module_4_278

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
import com.performance.module_4_278.R
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_257.Feature257ViewModel
import com.performance.module_3_249.Feature249ViewModel
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_274.Feature274ViewModel
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_258.Feature258ViewModel
import com.performance.module_3_262.Feature262ViewModel

class Feature278Activity : ComponentActivity() {
    private lateinit var viewModel: Feature278ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature278Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature278ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature278Screen() {
    Text(
        text = "Feature 278",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature278ScreenPreview() {
    MaterialTheme {
        Feature278Screen()
    }
}
