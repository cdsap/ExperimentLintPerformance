package com.performance.module_4_296

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
import com.performance.module_4_296.R
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_260.Feature260ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_261.Feature261ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_258.Feature258ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_264.Feature264ViewModel
import com.performance.module_3_247.Feature247ViewModel
import com.performance.module_3_250.Feature250ViewModel

class Feature296Activity : ComponentActivity() {
    private lateinit var viewModel: Feature296ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature296Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature296ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature296Screen() {
    Text(
        text = "Feature 296",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature296ScreenPreview() {
    MaterialTheme {
        Feature296Screen()
    }
}
