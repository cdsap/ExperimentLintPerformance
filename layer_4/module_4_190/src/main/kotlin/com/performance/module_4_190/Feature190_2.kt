package com.performance.module_4_190

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
import com.performance.module_4_190.R
import com.performance.module_3_177.Feature177ViewModel
import com.performance.module_3_172.Feature172ViewModel
import com.performance.module_3_182.Feature182ViewModel
import com.performance.module_3_181.Feature181ViewModel
import com.performance.module_3_174.Feature174ViewModel
import com.performance.module_3_170.Feature170ViewModel
import com.performance.module_3_179.Feature179ViewModel
import com.performance.module_3_175.Feature175ViewModel
import com.performance.module_3_173.Feature173ViewModel

class Feature190Activity : ComponentActivity() {
    private lateinit var viewModel: Feature190ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature190Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature190ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature190Screen() {
    Text(
        text = "Feature 190",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature190ScreenPreview() {
    MaterialTheme {
        Feature190Screen()
    }
}
