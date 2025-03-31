package com.performance.module_3_171

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
import com.performance.module_3_171.R
import com.performance.module_2_142.Feature142ViewModel
import com.performance.module_2_152.Feature152ViewModel
import com.performance.module_2_156.Feature156ViewModel
import com.performance.module_2_148.Feature148ViewModel
import com.performance.module_2_139.Feature139ViewModel
import com.performance.module_2_161.Feature161ViewModel
import com.performance.module_2_143.Feature143ViewModel

class Feature171Activity : ComponentActivity() {
    private lateinit var viewModel: Feature171ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature171Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature171ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature171Screen() {
    Text(
        text = "Feature 171",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature171ScreenPreview() {
    MaterialTheme {
        Feature171Screen()
    }
}
