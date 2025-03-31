package com.performance.module_3_177

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
import com.performance.module_3_177.R
import com.performance.module_2_151.Feature151ViewModel
import com.performance.module_2_159.Feature159ViewModel

class Feature177Activity : ComponentActivity() {
    private lateinit var viewModel: Feature177ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature177Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature177ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature177Screen() {
    Text(
        text = "Feature 177",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature177ScreenPreview() {
    MaterialTheme {
        Feature177Screen()
    }
}
