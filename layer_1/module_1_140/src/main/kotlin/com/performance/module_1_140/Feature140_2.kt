package com.performance.module_1_140

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
import com.performance.module_1_140.R
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_105.Feature105ViewModel

class Feature140Activity : ComponentActivity() {
    private lateinit var viewModel: Feature140ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature140Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature140ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature140Screen() {
    Text(
        text = "Feature 140",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature140ScreenPreview() {
    MaterialTheme {
        Feature140Screen()
    }
}
