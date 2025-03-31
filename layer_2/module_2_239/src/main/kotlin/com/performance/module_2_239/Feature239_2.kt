package com.performance.module_2_239

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
import com.performance.module_2_239.R
import com.performance.module_1_138.Feature138ViewModel
import com.performance.module_1_186.Feature186ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_137.Feature137ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_198.Feature198ViewModel
import com.performance.module_1_148.Feature148ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_178.Feature178ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_184.Feature184ViewModel

class Feature239Activity : ComponentActivity() {
    private lateinit var viewModel: Feature239ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature239Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature239ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature239Screen() {
    Text(
        text = "Feature 239",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature239ScreenPreview() {
    MaterialTheme {
        Feature239Screen()
    }
}
