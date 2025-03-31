package com.performance.module_4_78

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
import com.performance.module_4_78.R
import com.performance.module_3_62.Feature62ViewModel
import com.performance.module_3_71.Feature71ViewModel
import com.performance.module_3_56.Feature56ViewModel
import com.performance.module_3_50.Feature50ViewModel
import com.performance.module_3_66.Feature66ViewModel
import com.performance.module_3_57.Feature57ViewModel

class Feature78Activity : ComponentActivity() {
    private lateinit var viewModel: Feature78ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature78Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature78ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature78Screen() {
    Text(
        text = "Feature 78",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature78ScreenPreview() {
    MaterialTheme {
        Feature78Screen()
    }
}
