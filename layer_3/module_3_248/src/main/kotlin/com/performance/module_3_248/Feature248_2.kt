package com.performance.module_3_248

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
import com.performance.module_3_248.R
import com.performance.module_2_215.Feature215ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_199.Feature199ViewModel

class Feature248Activity : ComponentActivity() {
    private lateinit var viewModel: Feature248ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature248Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature248ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature248Screen() {
    Text(
        text = "Feature 248",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature248ScreenPreview() {
    MaterialTheme {
        Feature248Screen()
    }
}
