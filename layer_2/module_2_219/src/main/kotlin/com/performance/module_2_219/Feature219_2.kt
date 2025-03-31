package com.performance.module_2_219

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
import com.performance.module_2_219.R
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_186.Feature186ViewModel
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_135.Feature135ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_134.Feature134ViewModel

class Feature219Activity : ComponentActivity() {
    private lateinit var viewModel: Feature219ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature219Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature219ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature219Screen() {
    Text(
        text = "Feature 219",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature219ScreenPreview() {
    MaterialTheme {
        Feature219Screen()
    }
}
