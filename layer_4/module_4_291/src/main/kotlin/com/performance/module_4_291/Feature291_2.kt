package com.performance.module_4_291

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
import com.performance.module_4_291.R
import com.performance.module_3_259.Feature259ViewModel
import com.performance.module_3_250.Feature250ViewModel
import com.performance.module_3_244.Feature244ViewModel
import com.performance.module_3_248.Feature248ViewModel
import com.performance.module_3_253.Feature253ViewModel
import com.performance.module_3_269.Feature269ViewModel
import com.performance.module_3_255.Feature255ViewModel
import com.performance.module_3_272.Feature272ViewModel

class Feature291Activity : ComponentActivity() {
    private lateinit var viewModel: Feature291ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature291Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature291ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature291Screen() {
    Text(
        text = "Feature 291",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature291ScreenPreview() {
    MaterialTheme {
        Feature291Screen()
    }
}
