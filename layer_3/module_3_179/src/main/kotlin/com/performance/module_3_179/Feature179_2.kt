package com.performance.module_3_179

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
import com.performance.module_3_179.R
import com.performance.module_2_161.Feature161ViewModel
import com.performance.module_2_155.Feature155ViewModel
import com.performance.module_2_148.Feature148ViewModel
import com.performance.module_2_140.Feature140ViewModel
import com.performance.module_2_134.Feature134ViewModel
import com.performance.module_2_144.Feature144ViewModel
import com.performance.module_2_152.Feature152ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_143.Feature143ViewModel
import com.performance.module_2_145.Feature145ViewModel

class Feature179Activity : ComponentActivity() {
    private lateinit var viewModel: Feature179ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature179Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature179ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature179Screen() {
    Text(
        text = "Feature 179",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature179ScreenPreview() {
    MaterialTheme {
        Feature179Screen()
    }
}
