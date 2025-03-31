package com.performance.module_2_215

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
import com.performance.module_2_215.R
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_157.Feature157ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_170.Feature170ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_167.Feature167ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_147.Feature147ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_140.Feature140ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_171.Feature171ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_136.Feature136ViewModel

class Feature215Activity : ComponentActivity() {
    private lateinit var viewModel: Feature215ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature215Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature215ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature215Screen() {
    Text(
        text = "Feature 215",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature215ScreenPreview() {
    MaterialTheme {
        Feature215Screen()
    }
}
