package com.performance.module_4_197

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
import com.performance.module_4_197.R
import com.performance.module_3_169.Feature169ViewModel
import com.performance.module_3_179.Feature179ViewModel
import com.performance.module_3_175.Feature175ViewModel
import com.performance.module_3_177.Feature177ViewModel
import com.performance.module_3_163.Feature163ViewModel
import com.performance.module_3_183.Feature183ViewModel
import com.performance.module_3_178.Feature178ViewModel
import com.performance.module_3_171.Feature171ViewModel

class Feature197Activity : ComponentActivity() {
    private lateinit var viewModel: Feature197ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature197Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature197ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature197Screen() {
    Text(
        text = "Feature 197",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature197ScreenPreview() {
    MaterialTheme {
        Feature197Screen()
    }
}
