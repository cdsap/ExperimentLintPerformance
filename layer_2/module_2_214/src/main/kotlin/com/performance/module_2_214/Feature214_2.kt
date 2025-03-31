package com.performance.module_2_214

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
import com.performance.module_2_214.R
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_190.Feature190ViewModel

class Feature214Activity : ComponentActivity() {
    private lateinit var viewModel: Feature214ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature214Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature214ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature214Screen() {
    Text(
        text = "Feature 214",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature214ScreenPreview() {
    MaterialTheme {
        Feature214Screen()
    }
}
