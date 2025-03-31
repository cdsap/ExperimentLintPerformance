package com.performance.module_2_208

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
import com.performance.module_2_208.R
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_192.Feature192ViewModel

class Feature208Activity : ComponentActivity() {
    private lateinit var viewModel: Feature208ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature208Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature208ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature208Screen() {
    Text(
        text = "Feature 208",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature208ScreenPreview() {
    MaterialTheme {
        Feature208Screen()
    }
}
