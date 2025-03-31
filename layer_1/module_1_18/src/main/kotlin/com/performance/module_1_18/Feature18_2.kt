package com.performance.module_1_18

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
import com.performance.module_1_18.R
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_10.Feature10ViewModel

class Feature18Activity : ComponentActivity() {
    private lateinit var viewModel: Feature18ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature18Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature18ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature18Screen() {
    Text(
        text = "Feature 18",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature18ScreenPreview() {
    MaterialTheme {
        Feature18Screen()
    }
}
