package com.performance.module_1_114

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
import com.performance.module_1_114.R
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_54.Feature54ViewModel

class Feature114Activity : ComponentActivity() {
    private lateinit var viewModel: Feature114ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature114Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature114ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature114Screen() {
    Text(
        text = "Feature 114",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature114ScreenPreview() {
    MaterialTheme {
        Feature114Screen()
    }
}
