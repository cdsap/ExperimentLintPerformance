package com.performance.module_2_226

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
import com.performance.module_2_226.R
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_183.Feature183ViewModel

class Feature226Activity : ComponentActivity() {
    private lateinit var viewModel: Feature226ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature226Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature226ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature226Screen() {
    Text(
        text = "Feature 226",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature226ScreenPreview() {
    MaterialTheme {
        Feature226Screen()
    }
}
