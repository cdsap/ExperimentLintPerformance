package com.performance.module_1_47

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
import com.performance.module_1_47.R
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_6.Feature6ViewModel

class Feature47Activity : ComponentActivity() {
    private lateinit var viewModel: Feature47ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature47Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature47ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature47Screen() {
    Text(
        text = "Feature 47",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature47ScreenPreview() {
    MaterialTheme {
        Feature47Screen()
    }
}
