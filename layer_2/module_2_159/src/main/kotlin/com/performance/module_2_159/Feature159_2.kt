package com.performance.module_2_159

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
import com.performance.module_2_159.R
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_92.Feature92ViewModel

class Feature159Activity : ComponentActivity() {
    private lateinit var viewModel: Feature159ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature159Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature159ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature159Screen() {
    Text(
        text = "Feature 159",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature159ScreenPreview() {
    MaterialTheme {
        Feature159Screen()
    }
}
