package com.performance.module_3_260

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
import com.performance.module_3_260.R
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_229.Feature229ViewModel

class Feature260Activity : ComponentActivity() {
    private lateinit var viewModel: Feature260ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature260Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature260ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature260Screen() {
    Text(
        text = "Feature 260",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature260ScreenPreview() {
    MaterialTheme {
        Feature260Screen()
    }
}
