package com.performance.module_3_266

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
import com.performance.module_3_266.R
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_204.Feature204ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_216.Feature216ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_221.Feature221ViewModel
import com.performance.module_2_218.Feature218ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_215.Feature215ViewModel

class Feature266Activity : ComponentActivity() {
    private lateinit var viewModel: Feature266ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature266Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature266ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature266Screen() {
    Text(
        text = "Feature 266",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature266ScreenPreview() {
    MaterialTheme {
        Feature266Screen()
    }
}
