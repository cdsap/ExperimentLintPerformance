package com.performance.module_2_230

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
import com.performance.module_2_230.R
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_179.Feature179ViewModel

class Feature230Activity : ComponentActivity() {
    private lateinit var viewModel: Feature230ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature230Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature230ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature230Screen() {
    Text(
        text = "Feature 230",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature230ScreenPreview() {
    MaterialTheme {
        Feature230Screen()
    }
}
