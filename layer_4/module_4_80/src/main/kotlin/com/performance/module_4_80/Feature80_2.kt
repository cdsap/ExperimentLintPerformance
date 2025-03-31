package com.performance.module_4_80

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
import com.performance.module_4_80.R
import com.performance.module_3_59.Feature59ViewModel
import com.performance.module_3_73.Feature73ViewModel
import com.performance.module_3_70.Feature70ViewModel

class Feature80Activity : ComponentActivity() {
    private lateinit var viewModel: Feature80ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature80Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature80ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature80Screen() {
    Text(
        text = "Feature 80",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature80ScreenPreview() {
    MaterialTheme {
        Feature80Screen()
    }
}
