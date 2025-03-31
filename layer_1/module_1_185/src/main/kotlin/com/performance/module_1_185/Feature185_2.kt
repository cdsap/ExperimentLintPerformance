package com.performance.module_1_185

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
import com.performance.module_1_185.R
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_88.Feature88ViewModel

class Feature185Activity : ComponentActivity() {
    private lateinit var viewModel: Feature185ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature185Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature185ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature185Screen() {
    Text(
        text = "Feature 185",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature185ScreenPreview() {
    MaterialTheme {
        Feature185Screen()
    }
}
