package com.performance.module_3_175

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
import com.performance.module_3_175.R
import com.performance.module_2_150.Feature150ViewModel
import com.performance.module_2_137.Feature137ViewModel
import com.performance.module_2_152.Feature152ViewModel
import com.performance.module_2_154.Feature154ViewModel
import com.performance.module_2_160.Feature160ViewModel
import com.performance.module_2_146.Feature146ViewModel
import com.performance.module_2_133.Feature133ViewModel
import com.performance.module_2_138.Feature138ViewModel
import com.performance.module_2_142.Feature142ViewModel
import com.performance.module_2_156.Feature156ViewModel
import com.performance.module_2_162.Feature162ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_136.Feature136ViewModel
import com.performance.module_2_140.Feature140ViewModel

class Feature175Activity : ComponentActivity() {
    private lateinit var viewModel: Feature175ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature175Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature175ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature175Screen() {
    Text(
        text = "Feature 175",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature175ScreenPreview() {
    MaterialTheme {
        Feature175Screen()
    }
}
