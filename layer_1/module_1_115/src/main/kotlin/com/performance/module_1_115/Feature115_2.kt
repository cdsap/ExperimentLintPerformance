package com.performance.module_1_115

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
import com.performance.module_1_115.R
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_33.Feature33ViewModel

class Feature115Activity : ComponentActivity() {
    private lateinit var viewModel: Feature115ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature115Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature115ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature115Screen() {
    Text(
        text = "Feature 115",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature115ScreenPreview() {
    MaterialTheme {
        Feature115Screen()
    }
}
