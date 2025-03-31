package com.performance.module_3_176

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
import com.performance.module_3_176.R
import com.performance.module_2_142.Feature142ViewModel
import com.performance.module_2_144.Feature144ViewModel
import com.performance.module_2_143.Feature143ViewModel
import com.performance.module_2_134.Feature134ViewModel
import com.performance.module_2_147.Feature147ViewModel
import com.performance.module_2_136.Feature136ViewModel
import com.performance.module_2_141.Feature141ViewModel
import com.performance.module_2_151.Feature151ViewModel
import com.performance.module_2_149.Feature149ViewModel

class Feature176Activity : ComponentActivity() {
    private lateinit var viewModel: Feature176ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature176Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature176ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature176Screen() {
    Text(
        text = "Feature 176",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature176ScreenPreview() {
    MaterialTheme {
        Feature176Screen()
    }
}
