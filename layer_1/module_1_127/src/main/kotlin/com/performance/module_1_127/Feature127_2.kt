package com.performance.module_1_127

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
import com.performance.module_1_127.R
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_44.Feature44ViewModel

class Feature127Activity : ComponentActivity() {
    private lateinit var viewModel: Feature127ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature127Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature127ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature127Screen() {
    Text(
        text = "Feature 127",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature127ScreenPreview() {
    MaterialTheme {
        Feature127Screen()
    }
}
