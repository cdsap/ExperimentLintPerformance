package com.performance.module_3_244

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
import com.performance.module_3_244.R
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_230.Feature230ViewModel
import com.performance.module_2_229.Feature229ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_224.Feature224ViewModel

class Feature244Activity : ComponentActivity() {
    private lateinit var viewModel: Feature244ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature244Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature244ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature244Screen() {
    Text(
        text = "Feature 244",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature244ScreenPreview() {
    MaterialTheme {
        Feature244Screen()
    }
}
