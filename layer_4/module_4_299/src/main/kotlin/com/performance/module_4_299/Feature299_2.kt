package com.performance.module_4_299

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
import com.performance.module_4_299.R
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_254.Feature254ViewModel
import com.performance.module_3_271.Feature271ViewModel
import com.performance.module_3_272.Feature272ViewModel
import com.performance.module_3_262.Feature262ViewModel
import com.performance.module_3_249.Feature249ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_265.Feature265ViewModel
import com.performance.module_3_255.Feature255ViewModel

class Feature299Activity : ComponentActivity() {
    private lateinit var viewModel: Feature299ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature299Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature299ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature299Screen() {
    Text(
        text = "Feature 299",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature299ScreenPreview() {
    MaterialTheme {
        Feature299Screen()
    }
}
