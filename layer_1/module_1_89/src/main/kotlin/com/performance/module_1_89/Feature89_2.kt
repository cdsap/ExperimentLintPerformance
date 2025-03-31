package com.performance.module_1_89

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
import com.performance.module_1_89.R
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_43.Feature43ViewModel

class Feature89Activity : ComponentActivity() {
    private lateinit var viewModel: Feature89ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature89Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature89ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature89Screen() {
    Text(
        text = "Feature 89",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature89ScreenPreview() {
    MaterialTheme {
        Feature89Screen()
    }
}
