package com.performance.module_1_143

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
import com.performance.module_1_143.R
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_87.Feature87ViewModel

class Feature143Activity : ComponentActivity() {
    private lateinit var viewModel: Feature143ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature143Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature143ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature143Screen() {
    Text(
        text = "Feature 143",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature143ScreenPreview() {
    MaterialTheme {
        Feature143Screen()
    }
}
