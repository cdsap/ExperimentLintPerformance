package com.performance.module_1_98

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
import com.performance.module_1_98.R
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_70.Feature70ViewModel

class Feature98Activity : ComponentActivity() {
    private lateinit var viewModel: Feature98ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature98Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature98ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature98Screen() {
    Text(
        text = "Feature 98",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature98ScreenPreview() {
    MaterialTheme {
        Feature98Screen()
    }
}
