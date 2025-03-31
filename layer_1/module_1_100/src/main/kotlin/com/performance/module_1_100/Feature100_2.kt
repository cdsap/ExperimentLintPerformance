package com.performance.module_1_100

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
import com.performance.module_1_100.R
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_49.Feature49ViewModel

class Feature100Activity : ComponentActivity() {
    private lateinit var viewModel: Feature100ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature100Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature100ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature100Screen() {
    Text(
        text = "Feature 100",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature100ScreenPreview() {
    MaterialTheme {
        Feature100Screen()
    }
}
