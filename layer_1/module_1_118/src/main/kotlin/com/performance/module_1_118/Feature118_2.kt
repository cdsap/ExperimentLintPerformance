package com.performance.module_1_118

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
import com.performance.module_1_118.R
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_51.Feature51ViewModel

class Feature118Activity : ComponentActivity() {
    private lateinit var viewModel: Feature118ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature118Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature118ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature118Screen() {
    Text(
        text = "Feature 118",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature118ScreenPreview() {
    MaterialTheme {
        Feature118Screen()
    }
}
