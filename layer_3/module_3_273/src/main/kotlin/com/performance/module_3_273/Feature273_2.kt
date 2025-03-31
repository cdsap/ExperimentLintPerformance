package com.performance.module_3_273

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
import com.performance.module_3_273.R
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_215.Feature215ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_221.Feature221ViewModel

class Feature273Activity : ComponentActivity() {
    private lateinit var viewModel: Feature273ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature273Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature273ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature273Screen() {
    Text(
        text = "Feature 273",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature273ScreenPreview() {
    MaterialTheme {
        Feature273Screen()
    }
}
