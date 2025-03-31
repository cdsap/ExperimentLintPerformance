package com.performance.module_2_155

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
import com.performance.module_2_155.R
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_103.Feature103ViewModel
import com.performance.module_1_129.Feature129ViewModel
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_117.Feature117ViewModel
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_114.Feature114ViewModel
import com.performance.module_1_132.Feature132ViewModel

class Feature155Activity : ComponentActivity() {
    private lateinit var viewModel: Feature155ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature155Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature155ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature155Screen() {
    Text(
        text = "Feature 155",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature155ScreenPreview() {
    MaterialTheme {
        Feature155Screen()
    }
}
