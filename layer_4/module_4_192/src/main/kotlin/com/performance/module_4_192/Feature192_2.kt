package com.performance.module_4_192

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
import com.performance.module_4_192.R
import com.performance.module_3_174.Feature174ViewModel
import com.performance.module_3_163.Feature163ViewModel
import com.performance.module_3_179.Feature179ViewModel
import com.performance.module_3_164.Feature164ViewModel
import com.performance.module_3_167.Feature167ViewModel
import com.performance.module_3_181.Feature181ViewModel
import com.performance.module_3_177.Feature177ViewModel
import com.performance.module_3_169.Feature169ViewModel
import com.performance.module_3_165.Feature165ViewModel

class Feature192Activity : ComponentActivity() {
    private lateinit var viewModel: Feature192ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature192Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature192ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature192Screen() {
    Text(
        text = "Feature 192",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature192ScreenPreview() {
    MaterialTheme {
        Feature192Screen()
    }
}
