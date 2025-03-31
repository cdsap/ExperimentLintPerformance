package com.performance.module_3_163

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
import com.performance.module_3_163.R
import com.performance.module_2_137.Feature137ViewModel
import com.performance.module_2_162.Feature162ViewModel
import com.performance.module_2_134.Feature134ViewModel
import com.performance.module_2_147.Feature147ViewModel
import com.performance.module_2_152.Feature152ViewModel
import com.performance.module_2_149.Feature149ViewModel
import com.performance.module_2_150.Feature150ViewModel
import com.performance.module_2_148.Feature148ViewModel
import com.performance.module_2_156.Feature156ViewModel
import com.performance.module_2_146.Feature146ViewModel
import com.performance.module_2_141.Feature141ViewModel
import com.performance.module_2_158.Feature158ViewModel

class Feature163Activity : ComponentActivity() {
    private lateinit var viewModel: Feature163ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature163Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature163ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature163Screen() {
    Text(
        text = "Feature 163",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature163ScreenPreview() {
    MaterialTheme {
        Feature163Screen()
    }
}
