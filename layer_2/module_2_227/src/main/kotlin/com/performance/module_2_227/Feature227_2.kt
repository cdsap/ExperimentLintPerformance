package com.performance.module_2_227

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
import com.performance.module_2_227.R
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_154.Feature154ViewModel

class Feature227Activity : ComponentActivity() {
    private lateinit var viewModel: Feature227ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature227Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature227ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature227Screen() {
    Text(
        text = "Feature 227",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature227ScreenPreview() {
    MaterialTheme {
        Feature227Screen()
    }
}
