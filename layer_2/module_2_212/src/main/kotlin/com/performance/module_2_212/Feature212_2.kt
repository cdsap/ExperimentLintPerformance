package com.performance.module_2_212

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
import com.performance.module_2_212.R
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_181.Feature181ViewModel

class Feature212Activity : ComponentActivity() {
    private lateinit var viewModel: Feature212ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature212Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature212ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature212Screen() {
    Text(
        text = "Feature 212",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature212ScreenPreview() {
    MaterialTheme {
        Feature212Screen()
    }
}
