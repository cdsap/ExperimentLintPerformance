package com.performance.module_4_189

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
import com.performance.module_4_189.R
import com.performance.module_3_182.Feature182ViewModel
import com.performance.module_3_173.Feature173ViewModel

class Feature189Activity : ComponentActivity() {
    private lateinit var viewModel: Feature189ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature189Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature189ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature189Screen() {
    Text(
        text = "Feature 189",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature189ScreenPreview() {
    MaterialTheme {
        Feature189Screen()
    }
}
