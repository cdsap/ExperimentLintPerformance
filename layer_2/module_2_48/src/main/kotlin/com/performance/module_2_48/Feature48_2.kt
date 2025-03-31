package com.performance.module_2_48

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
import com.performance.module_2_48.R
import com.performance.module_1_44.Feature44ViewModel
import com.performance.module_1_39.Feature39ViewModel
import com.performance.module_1_40.Feature40ViewModel
import com.performance.module_1_20.Feature20ViewModel
import com.performance.module_1_34.Feature34ViewModel
import com.performance.module_1_32.Feature32ViewModel
import com.performance.module_1_43.Feature43ViewModel
import com.performance.module_1_33.Feature33ViewModel
import com.performance.module_1_42.Feature42ViewModel
import com.performance.module_1_24.Feature24ViewModel
import com.performance.module_1_47.Feature47ViewModel
import com.performance.module_1_29.Feature29ViewModel
import com.performance.module_1_27.Feature27ViewModel
import com.performance.module_1_23.Feature23ViewModel
import com.performance.module_1_22.Feature22ViewModel
import com.performance.module_1_36.Feature36ViewModel

class Feature48Activity : ComponentActivity() {
    private lateinit var viewModel: Feature48ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature48Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature48ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature48Screen() {
    Text(
        text = "Feature 48",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature48ScreenPreview() {
    MaterialTheme {
        Feature48Screen()
    }
}
