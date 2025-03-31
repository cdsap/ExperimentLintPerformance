package com.performance.module_3_182

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
import com.performance.module_3_182.R
import com.performance.module_2_154.Feature154ViewModel
import com.performance.module_2_135.Feature135ViewModel
import com.performance.module_2_156.Feature156ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_137.Feature137ViewModel
import com.performance.module_2_134.Feature134ViewModel

class Feature182Activity : ComponentActivity() {
    private lateinit var viewModel: Feature182ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature182Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature182ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature182Screen() {
    Text(
        text = "Feature 182",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature182ScreenPreview() {
    MaterialTheme {
        Feature182Screen()
    }
}
