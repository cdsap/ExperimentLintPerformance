package com.performance.module_2_147

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
import com.performance.module_2_147.R
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_119.Feature119ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_103.Feature103ViewModel
import com.performance.module_1_113.Feature113ViewModel

class Feature147Activity : ComponentActivity() {
    private lateinit var viewModel: Feature147ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature147Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature147ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature147Screen() {
    Text(
        text = "Feature 147",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature147ScreenPreview() {
    MaterialTheme {
        Feature147Screen()
    }
}
