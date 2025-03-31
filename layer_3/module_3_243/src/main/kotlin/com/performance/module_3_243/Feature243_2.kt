package com.performance.module_3_243

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
import com.performance.module_3_243.R
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_242.Feature242ViewModel

class Feature243Activity : ComponentActivity() {
    private lateinit var viewModel: Feature243ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature243Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature243ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature243Screen() {
    Text(
        text = "Feature 243",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature243ScreenPreview() {
    MaterialTheme {
        Feature243Screen()
    }
}
