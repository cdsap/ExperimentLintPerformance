package com.performance.module_4_286

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
import com.performance.module_4_286.R
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_271.Feature271ViewModel

class Feature286Activity : ComponentActivity() {
    private lateinit var viewModel: Feature286ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature286Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature286ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature286Screen() {
    Text(
        text = "Feature 286",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature286ScreenPreview() {
    MaterialTheme {
        Feature286Screen()
    }
}
