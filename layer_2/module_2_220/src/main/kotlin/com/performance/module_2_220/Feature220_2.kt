package com.performance.module_2_220

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
import com.performance.module_2_220.R
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_171.Feature171ViewModel

class Feature220Activity : ComponentActivity() {
    private lateinit var viewModel: Feature220ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature220Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature220ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature220Screen() {
    Text(
        text = "Feature 220",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature220ScreenPreview() {
    MaterialTheme {
        Feature220Screen()
    }
}
