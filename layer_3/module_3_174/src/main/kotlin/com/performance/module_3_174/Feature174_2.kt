package com.performance.module_3_174

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
import com.performance.module_3_174.R
import com.performance.module_2_153.Feature153ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_159.Feature159ViewModel
import com.performance.module_2_162.Feature162ViewModel
import com.performance.module_2_139.Feature139ViewModel
import com.performance.module_2_145.Feature145ViewModel
import com.performance.module_2_142.Feature142ViewModel
import com.performance.module_2_148.Feature148ViewModel

class Feature174Activity : ComponentActivity() {
    private lateinit var viewModel: Feature174ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature174Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature174ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature174Screen() {
    Text(
        text = "Feature 174",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature174ScreenPreview() {
    MaterialTheme {
        Feature174Screen()
    }
}
