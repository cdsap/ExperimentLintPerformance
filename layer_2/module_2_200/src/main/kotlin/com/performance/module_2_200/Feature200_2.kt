package com.performance.module_2_200

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
import com.performance.module_2_200.R
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_182.Feature182ViewModel

class Feature200Activity : ComponentActivity() {
    private lateinit var viewModel: Feature200ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature200Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature200ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature200Screen() {
    Text(
        text = "Feature 200",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature200ScreenPreview() {
    MaterialTheme {
        Feature200Screen()
    }
}
