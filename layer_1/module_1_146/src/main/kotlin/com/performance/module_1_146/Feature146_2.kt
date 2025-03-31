package com.performance.module_1_146

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
import com.performance.module_1_146.R
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_125.Feature125ViewModel

class Feature146Activity : ComponentActivity() {
    private lateinit var viewModel: Feature146ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature146Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature146ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature146Screen() {
    Text(
        text = "Feature 146",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature146ScreenPreview() {
    MaterialTheme {
        Feature146Screen()
    }
}
