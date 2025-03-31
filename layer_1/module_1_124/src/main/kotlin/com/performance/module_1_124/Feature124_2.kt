package com.performance.module_1_124

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
import com.performance.module_1_124.R
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_75.Feature75ViewModel

class Feature124Activity : ComponentActivity() {
    private lateinit var viewModel: Feature124ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature124Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature124ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature124Screen() {
    Text(
        text = "Feature 124",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature124ScreenPreview() {
    MaterialTheme {
        Feature124Screen()
    }
}
