package com.performance.module_3_263

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
import com.performance.module_3_263.R
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_221.Feature221ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_237.Feature237ViewModel

class Feature263Activity : ComponentActivity() {
    private lateinit var viewModel: Feature263ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature263Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature263ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature263Screen() {
    Text(
        text = "Feature 263",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature263ScreenPreview() {
    MaterialTheme {
        Feature263Screen()
    }
}
