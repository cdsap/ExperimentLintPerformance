package com.performance.module_3_254

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
import com.performance.module_3_254.R
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_223.Feature223ViewModel

class Feature254Activity : ComponentActivity() {
    private lateinit var viewModel: Feature254ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature254Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature254ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature254Screen() {
    Text(
        text = "Feature 254",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature254ScreenPreview() {
    MaterialTheme {
        Feature254Screen()
    }
}
