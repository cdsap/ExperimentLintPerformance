package com.performance.module_1_113

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
import com.performance.module_1_113.R
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_22.Feature22ViewModel

class Feature113Activity : ComponentActivity() {
    private lateinit var viewModel: Feature113ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature113Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature113ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature113Screen() {
    Text(
        text = "Feature 113",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature113ScreenPreview() {
    MaterialTheme {
        Feature113Screen()
    }
}
