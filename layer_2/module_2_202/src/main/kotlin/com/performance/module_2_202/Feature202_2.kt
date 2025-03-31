package com.performance.module_2_202

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
import com.performance.module_2_202.R
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_146.Feature146ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_186.Feature186ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_145.Feature145ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_162.Feature162ViewModel

class Feature202Activity : ComponentActivity() {
    private lateinit var viewModel: Feature202ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature202Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature202ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature202Screen() {
    Text(
        text = "Feature 202",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature202ScreenPreview() {
    MaterialTheme {
        Feature202Screen()
    }
}
