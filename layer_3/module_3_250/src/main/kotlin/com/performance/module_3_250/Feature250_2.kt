package com.performance.module_3_250

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
import com.performance.module_3_250.R
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_199.Feature199ViewModel
import com.performance.module_2_215.Feature215ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_221.Feature221ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_201.Feature201ViewModel

class Feature250Activity : ComponentActivity() {
    private lateinit var viewModel: Feature250ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature250Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature250ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature250Screen() {
    Text(
        text = "Feature 250",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature250ScreenPreview() {
    MaterialTheme {
        Feature250Screen()
    }
}
