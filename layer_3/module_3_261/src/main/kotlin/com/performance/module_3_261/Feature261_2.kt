package com.performance.module_3_261

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
import com.performance.module_3_261.R
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_229.Feature229ViewModel

class Feature261Activity : ComponentActivity() {
    private lateinit var viewModel: Feature261ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature261Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature261ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature261Screen() {
    Text(
        text = "Feature 261",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature261ScreenPreview() {
    MaterialTheme {
        Feature261Screen()
    }
}
