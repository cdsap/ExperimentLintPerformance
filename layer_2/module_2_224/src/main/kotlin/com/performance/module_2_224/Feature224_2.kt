package com.performance.module_2_224

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
import com.performance.module_2_224.R
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_148.Feature148ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_180.Feature180ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_145.Feature145ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_186.Feature186ViewModel

class Feature224Activity : ComponentActivity() {
    private lateinit var viewModel: Feature224ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature224Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature224ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature224Screen() {
    Text(
        text = "Feature 224",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature224ScreenPreview() {
    MaterialTheme {
        Feature224Screen()
    }
}
