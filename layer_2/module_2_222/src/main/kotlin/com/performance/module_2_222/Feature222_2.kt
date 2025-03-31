package com.performance.module_2_222

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
import com.performance.module_2_222.R
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_187.Feature187ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_135.Feature135ViewModel
import com.performance.module_1_171.Feature171ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_145.Feature145ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_162.Feature162ViewModel

class Feature222Activity : ComponentActivity() {
    private lateinit var viewModel: Feature222ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature222Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature222ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature222Screen() {
    Text(
        text = "Feature 222",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature222ScreenPreview() {
    MaterialTheme {
        Feature222Screen()
    }
}
