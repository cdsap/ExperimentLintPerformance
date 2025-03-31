package com.performance.module_1_175

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
import com.performance.module_1_175.R
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_91.Feature91ViewModel

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
