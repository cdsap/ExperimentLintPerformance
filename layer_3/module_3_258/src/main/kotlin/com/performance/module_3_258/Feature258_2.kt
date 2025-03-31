package com.performance.module_3_258

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
import com.performance.module_3_258.R
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_213.Feature213ViewModel

class Feature258Activity : ComponentActivity() {
    private lateinit var viewModel: Feature258ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature258Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature258ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature258Screen() {
    Text(
        text = "Feature 258",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature258ScreenPreview() {
    MaterialTheme {
        Feature258Screen()
    }
}
