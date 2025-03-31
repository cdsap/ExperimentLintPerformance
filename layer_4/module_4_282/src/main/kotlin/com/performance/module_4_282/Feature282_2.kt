package com.performance.module_4_282

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
import com.performance.module_4_282.R
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_263.Feature263ViewModel
import com.performance.module_3_250.Feature250ViewModel
import com.performance.module_3_255.Feature255ViewModel
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_256.Feature256ViewModel
import com.performance.module_3_258.Feature258ViewModel
import com.performance.module_3_246.Feature246ViewModel
import com.performance.module_3_266.Feature266ViewModel
import com.performance.module_3_270.Feature270ViewModel
import com.performance.module_3_264.Feature264ViewModel

class Feature282Activity : ComponentActivity() {
    private lateinit var viewModel: Feature282ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature282Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature282ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature282Screen() {
    Text(
        text = "Feature 282",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature282ScreenPreview() {
    MaterialTheme {
        Feature282Screen()
    }
}
