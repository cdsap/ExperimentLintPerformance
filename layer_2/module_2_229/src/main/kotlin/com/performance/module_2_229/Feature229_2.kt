package com.performance.module_2_229

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
import com.performance.module_2_229.R
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_157.Feature157ViewModel

class Feature229Activity : ComponentActivity() {
    private lateinit var viewModel: Feature229ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature229Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature229ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature229Screen() {
    Text(
        text = "Feature 229",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature229ScreenPreview() {
    MaterialTheme {
        Feature229Screen()
    }
}
