package com.performance.module_3_178

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
import com.performance.module_3_178.R
import com.performance.module_2_155.Feature155ViewModel
import com.performance.module_2_137.Feature137ViewModel
import com.performance.module_2_148.Feature148ViewModel
import com.performance.module_2_143.Feature143ViewModel
import com.performance.module_2_157.Feature157ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_159.Feature159ViewModel
import com.performance.module_2_160.Feature160ViewModel
import com.performance.module_2_151.Feature151ViewModel
import com.performance.module_2_152.Feature152ViewModel

class Feature178Activity : ComponentActivity() {
    private lateinit var viewModel: Feature178ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature178Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature178ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature178Screen() {
    Text(
        text = "Feature 178",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature178ScreenPreview() {
    MaterialTheme {
        Feature178Screen()
    }
}
