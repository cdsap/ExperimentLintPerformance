package com.performance.module_5_201

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
import com.performance.module_5_201.R
import com.performance.module_4_188.Feature188ViewModel
import com.performance.module_4_189.Feature189ViewModel
import com.performance.module_4_195.Feature195ViewModel
import com.performance.module_4_186.Feature186ViewModel
import com.performance.module_4_194.Feature194ViewModel
import com.performance.module_4_200.Feature200ViewModel
import com.performance.module_4_197.Feature197ViewModel
import com.performance.module_4_193.Feature193ViewModel

class Feature201Activity : ComponentActivity() {
    private lateinit var viewModel: Feature201ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature201Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature201ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature201Screen() {
    Text(
        text = "Feature 201",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature201ScreenPreview() {
    MaterialTheme {
        Feature201Screen()
    }
}
