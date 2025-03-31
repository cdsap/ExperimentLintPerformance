package com.performance.module_3_180

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
import com.performance.module_3_180.R
import com.performance.module_2_139.Feature139ViewModel
import com.performance.module_2_140.Feature140ViewModel
import com.performance.module_2_137.Feature137ViewModel

class Feature180Activity : ComponentActivity() {
    private lateinit var viewModel: Feature180ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature180Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature180ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature180Screen() {
    Text(
        text = "Feature 180",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature180ScreenPreview() {
    MaterialTheme {
        Feature180Screen()
    }
}
