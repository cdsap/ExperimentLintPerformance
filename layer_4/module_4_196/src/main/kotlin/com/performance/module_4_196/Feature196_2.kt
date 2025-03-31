package com.performance.module_4_196

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
import com.performance.module_4_196.R
import com.performance.module_3_171.Feature171ViewModel
import com.performance.module_3_177.Feature177ViewModel

class Feature196Activity : ComponentActivity() {
    private lateinit var viewModel: Feature196ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature196Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature196ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature196Screen() {
    Text(
        text = "Feature 196",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature196ScreenPreview() {
    MaterialTheme {
        Feature196Screen()
    }
}
