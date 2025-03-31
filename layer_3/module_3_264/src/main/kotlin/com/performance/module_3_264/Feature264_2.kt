package com.performance.module_3_264

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
import com.performance.module_3_264.R
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_231.Feature231ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_221.Feature221ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_235.Feature235ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_212.Feature212ViewModel

class Feature264Activity : ComponentActivity() {
    private lateinit var viewModel: Feature264ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature264Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature264ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature264Screen() {
    Text(
        text = "Feature 264",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature264ScreenPreview() {
    MaterialTheme {
        Feature264Screen()
    }
}
