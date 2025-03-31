package com.performance.module_2_217

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
import com.performance.module_2_217.R
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_139.Feature139ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_148.Feature148ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_136.Feature136ViewModel
import com.performance.module_1_179.Feature179ViewModel
import com.performance.module_1_169.Feature169ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_158.Feature158ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_134.Feature134ViewModel
import com.performance.module_1_155.Feature155ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_151.Feature151ViewModel

class Feature217Activity : ComponentActivity() {
    private lateinit var viewModel: Feature217ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature217Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature217ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature217Screen() {
    Text(
        text = "Feature 217",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature217ScreenPreview() {
    MaterialTheme {
        Feature217Screen()
    }
}
