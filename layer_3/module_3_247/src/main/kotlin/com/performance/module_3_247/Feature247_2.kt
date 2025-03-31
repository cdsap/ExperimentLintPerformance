package com.performance.module_3_247

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
import com.performance.module_3_247.R
import com.performance.module_2_217.Feature217ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_242.Feature242ViewModel

class Feature247Activity : ComponentActivity() {
    private lateinit var viewModel: Feature247ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature247Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature247ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature247Screen() {
    Text(
        text = "Feature 247",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature247ScreenPreview() {
    MaterialTheme {
        Feature247Screen()
    }
}
