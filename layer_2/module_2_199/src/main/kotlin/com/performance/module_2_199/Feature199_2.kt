package com.performance.module_2_199

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
import com.performance.module_2_199.R
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_159.Feature159ViewModel

class Feature199Activity : ComponentActivity() {
    private lateinit var viewModel: Feature199ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature199Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature199ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature199Screen() {
    Text(
        text = "Feature 199",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature199ScreenPreview() {
    MaterialTheme {
        Feature199Screen()
    }
}
