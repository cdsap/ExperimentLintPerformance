package com.performance.module_3_268

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
import com.performance.module_3_268.R
import com.performance.module_2_215.Feature215ViewModel
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_241.Feature241ViewModel

class Feature268Activity : ComponentActivity() {
    private lateinit var viewModel: Feature268ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature268Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature268ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature268Screen() {
    Text(
        text = "Feature 268",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature268ScreenPreview() {
    MaterialTheme {
        Feature268Screen()
    }
}
