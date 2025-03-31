package com.performance.module_3_245

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
import com.performance.module_3_245.R
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_229.Feature229ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_231.Feature231ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_235.Feature235ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_227.Feature227ViewModel

class Feature245Activity : ComponentActivity() {
    private lateinit var viewModel: Feature245ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature245Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature245ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature245Screen() {
    Text(
        text = "Feature 245",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature245ScreenPreview() {
    MaterialTheme {
        Feature245Screen()
    }
}
