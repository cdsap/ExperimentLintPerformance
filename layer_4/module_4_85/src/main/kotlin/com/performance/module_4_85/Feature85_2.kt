package com.performance.module_4_85

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
import com.performance.module_4_85.R
import com.performance.module_3_62.Feature62ViewModel
import com.performance.module_3_58.Feature58ViewModel
import com.performance.module_3_65.Feature65ViewModel
import com.performance.module_3_74.Feature74ViewModel
import com.performance.module_3_59.Feature59ViewModel
import com.performance.module_3_70.Feature70ViewModel
import com.performance.module_3_67.Feature67ViewModel

class Feature85Activity : ComponentActivity() {
    private lateinit var viewModel: Feature85ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature85Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature85ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature85Screen() {
    Text(
        text = "Feature 85",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature85ScreenPreview() {
    MaterialTheme {
        Feature85Screen()
    }
}
