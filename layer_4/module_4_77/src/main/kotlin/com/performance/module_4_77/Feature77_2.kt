package com.performance.module_4_77

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
import com.performance.module_4_77.R
import com.performance.module_3_49.Feature49ViewModel
import com.performance.module_3_63.Feature63ViewModel
import com.performance.module_3_57.Feature57ViewModel
import com.performance.module_3_72.Feature72ViewModel
import com.performance.module_3_61.Feature61ViewModel

class Feature77Activity : ComponentActivity() {
    private lateinit var viewModel: Feature77ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature77Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature77ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature77Screen() {
    Text(
        text = "Feature 77",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature77ScreenPreview() {
    MaterialTheme {
        Feature77Screen()
    }
}
