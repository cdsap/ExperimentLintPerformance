package com.performance.module_1_138

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
import com.performance.module_1_138.R
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_131.Feature131ViewModel

class Feature138Activity : ComponentActivity() {
    private lateinit var viewModel: Feature138ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature138Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature138ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature138Screen() {
    Text(
        text = "Feature 138",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature138ScreenPreview() {
    MaterialTheme {
        Feature138Screen()
    }
}
