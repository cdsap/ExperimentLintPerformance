package com.performance.module_4_75

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
import com.performance.module_4_75.R
import com.performance.module_3_51.Feature51ViewModel
import com.performance.module_3_64.Feature64ViewModel
import com.performance.module_3_62.Feature62ViewModel
import com.performance.module_3_65.Feature65ViewModel
import com.performance.module_3_52.Feature52ViewModel
import com.performance.module_3_71.Feature71ViewModel
import com.performance.module_3_63.Feature63ViewModel
import com.performance.module_3_60.Feature60ViewModel
import com.performance.module_3_67.Feature67ViewModel

class Feature75Activity : ComponentActivity() {
    private lateinit var viewModel: Feature75ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature75Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature75ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature75Screen() {
    Text(
        text = "Feature 75",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature75ScreenPreview() {
    MaterialTheme {
        Feature75Screen()
    }
}
