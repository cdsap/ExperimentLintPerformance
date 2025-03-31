package com.performance.module_3_272

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
import com.performance.module_3_272.R
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_224.Feature224ViewModel

class Feature272Activity : ComponentActivity() {
    private lateinit var viewModel: Feature272ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature272Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature272ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature272Screen() {
    Text(
        text = "Feature 272",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature272ScreenPreview() {
    MaterialTheme {
        Feature272Screen()
    }
}
