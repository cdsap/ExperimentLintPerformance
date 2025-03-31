package com.performance.module_1_107

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
import com.performance.module_1_107.R
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_76.Feature76ViewModel

class Feature107Activity : ComponentActivity() {
    private lateinit var viewModel: Feature107ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature107Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature107ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature107Screen() {
    Text(
        text = "Feature 107",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature107ScreenPreview() {
    MaterialTheme {
        Feature107Screen()
    }
}
