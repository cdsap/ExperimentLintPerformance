package com.performance.module_1_152

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
import com.performance.module_1_152.R
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_132.Feature132ViewModel

class Feature152Activity : ComponentActivity() {
    private lateinit var viewModel: Feature152ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature152Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature152ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature152Screen() {
    Text(
        text = "Feature 152",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature152ScreenPreview() {
    MaterialTheme {
        Feature152Screen()
    }
}
