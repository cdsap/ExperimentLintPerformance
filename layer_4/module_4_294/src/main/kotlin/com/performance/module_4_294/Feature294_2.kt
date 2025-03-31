package com.performance.module_4_294

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
import com.performance.module_4_294.R
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_248.Feature248ViewModel

class Feature294Activity : ComponentActivity() {
    private lateinit var viewModel: Feature294ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature294Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature294ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature294Screen() {
    Text(
        text = "Feature 294",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature294ScreenPreview() {
    MaterialTheme {
        Feature294Screen()
    }
}
