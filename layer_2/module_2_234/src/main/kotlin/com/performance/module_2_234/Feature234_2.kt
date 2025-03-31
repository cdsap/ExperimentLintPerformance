package com.performance.module_2_234

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
import com.performance.module_2_234.R
import com.performance.module_1_156.Feature156ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_148.Feature148ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_184.Feature184ViewModel
import com.performance.module_1_142.Feature142ViewModel

class Feature234Activity : ComponentActivity() {
    private lateinit var viewModel: Feature234ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature234Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature234ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature234Screen() {
    Text(
        text = "Feature 234",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature234ScreenPreview() {
    MaterialTheme {
        Feature234Screen()
    }
}
