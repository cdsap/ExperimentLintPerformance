package com.performance.module_2_203

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
import com.performance.module_2_203.R
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_187.Feature187ViewModel

class Feature203Activity : ComponentActivity() {
    private lateinit var viewModel: Feature203ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature203Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature203ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature203Screen() {
    Text(
        text = "Feature 203",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature203ScreenPreview() {
    MaterialTheme {
        Feature203Screen()
    }
}
