package com.performance.module_2_238

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
import com.performance.module_2_238.R
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_148.Feature148ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_146.Feature146ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_186.Feature186ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_144.Feature144ViewModel

class Feature238Activity : ComponentActivity() {
    private lateinit var viewModel: Feature238ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature238Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature238ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature238Screen() {
    Text(
        text = "Feature 238",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature238ScreenPreview() {
    MaterialTheme {
        Feature238Screen()
    }
}
