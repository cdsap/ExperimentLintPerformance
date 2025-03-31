package com.performance.module_2_161

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
import com.performance.module_2_161.R
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_94.Feature94ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_106.Feature106ViewModel

class Feature161Activity : ComponentActivity() {
    private lateinit var viewModel: Feature161ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature161Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature161ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature161Screen() {
    Text(
        text = "Feature 161",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature161ScreenPreview() {
    MaterialTheme {
        Feature161Screen()
    }
}
