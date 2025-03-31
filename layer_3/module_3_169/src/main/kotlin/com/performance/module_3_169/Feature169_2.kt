package com.performance.module_3_169

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
import com.performance.module_3_169.R
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_140.Feature140ViewModel
import com.performance.module_2_160.Feature160ViewModel
import com.performance.module_2_161.Feature161ViewModel
import com.performance.module_2_162.Feature162ViewModel
import com.performance.module_2_146.Feature146ViewModel
import com.performance.module_2_155.Feature155ViewModel
import com.performance.module_2_153.Feature153ViewModel

class Feature169Activity : ComponentActivity() {
    private lateinit var viewModel: Feature169ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature169Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature169ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature169Screen() {
    Text(
        text = "Feature 169",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature169ScreenPreview() {
    MaterialTheme {
        Feature169Screen()
    }
}
