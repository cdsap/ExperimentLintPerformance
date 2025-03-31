package com.performance.module_2_231

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
import com.performance.module_2_231.R
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_146.Feature146ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_171.Feature171ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_158.Feature158ViewModel

class Feature231Activity : ComponentActivity() {
    private lateinit var viewModel: Feature231ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature231Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature231ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature231Screen() {
    Text(
        text = "Feature 231",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature231ScreenPreview() {
    MaterialTheme {
        Feature231Screen()
    }
}
