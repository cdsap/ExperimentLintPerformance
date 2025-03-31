package com.performance.module_4_185

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
import com.performance.module_4_185.R
import com.performance.module_3_166.Feature166ViewModel
import com.performance.module_3_167.Feature167ViewModel

class Feature185Activity : ComponentActivity() {
    private lateinit var viewModel: Feature185ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature185Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature185ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature185Screen() {
    Text(
        text = "Feature 185",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature185ScreenPreview() {
    MaterialTheme {
        Feature185Screen()
    }
}
