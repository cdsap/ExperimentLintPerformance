package com.performance.module_1_169

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
import com.performance.module_1_169.R
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_120.Feature120ViewModel

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
