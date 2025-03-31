package com.performance.module_4_79

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
import com.performance.module_4_79.R
import com.performance.module_3_64.Feature64ViewModel
import com.performance.module_3_71.Feature71ViewModel
import com.performance.module_3_74.Feature74ViewModel
import com.performance.module_3_57.Feature57ViewModel
import com.performance.module_3_69.Feature69ViewModel
import com.performance.module_3_49.Feature49ViewModel
import com.performance.module_3_52.Feature52ViewModel
import com.performance.module_3_59.Feature59ViewModel
import com.performance.module_3_63.Feature63ViewModel
import com.performance.module_3_55.Feature55ViewModel

class Feature79Activity : ComponentActivity() {
    private lateinit var viewModel: Feature79ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature79Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature79ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature79Screen() {
    Text(
        text = "Feature 79",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature79ScreenPreview() {
    MaterialTheme {
        Feature79Screen()
    }
}
