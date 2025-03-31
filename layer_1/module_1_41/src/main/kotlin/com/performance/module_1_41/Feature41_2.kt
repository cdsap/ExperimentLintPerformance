package com.performance.module_1_41

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
import com.performance.module_1_41.R
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_6.Feature6ViewModel

class Feature41Activity : ComponentActivity() {
    private lateinit var viewModel: Feature41ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature41Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature41ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature41Screen() {
    Text(
        text = "Feature 41",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature41ScreenPreview() {
    MaterialTheme {
        Feature41Screen()
    }
}
