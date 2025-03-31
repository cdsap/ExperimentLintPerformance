package com.performance.module_5_88

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
import com.performance.module_5_88.R
import com.performance.module_4_76.Feature76ViewModel
import com.performance.module_4_82.Feature82ViewModel
import com.performance.module_4_78.Feature78ViewModel
import com.performance.module_4_81.Feature81ViewModel
import com.performance.module_4_80.Feature80ViewModel
import com.performance.module_4_85.Feature85ViewModel

class Feature88Activity : ComponentActivity() {
    private lateinit var viewModel: Feature88ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature88Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature88ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature88Screen() {
    Text(
        text = "Feature 88",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature88ScreenPreview() {
    MaterialTheme {
        Feature88Screen()
    }
}
