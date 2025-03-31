package com.performance.module_2_151

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
import com.performance.module_2_151.R
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_106.Feature106ViewModel
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_115.Feature115ViewModel
import com.performance.module_1_111.Feature111ViewModel

class Feature151Activity : ComponentActivity() {
    private lateinit var viewModel: Feature151ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature151Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature151ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature151Screen() {
    Text(
        text = "Feature 151",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature151ScreenPreview() {
    MaterialTheme {
        Feature151Screen()
    }
}
