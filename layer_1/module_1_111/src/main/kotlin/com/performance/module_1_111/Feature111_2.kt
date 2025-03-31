package com.performance.module_1_111

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
import com.performance.module_1_111.R
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_16.Feature16ViewModel

class Feature111Activity : ComponentActivity() {
    private lateinit var viewModel: Feature111ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature111Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature111ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature111Screen() {
    Text(
        text = "Feature 111",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature111ScreenPreview() {
    MaterialTheme {
        Feature111Screen()
    }
}
