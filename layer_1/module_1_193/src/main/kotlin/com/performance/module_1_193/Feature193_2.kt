package com.performance.module_1_193

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
import com.performance.module_1_193.R
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_130.Feature130ViewModel

class Feature193Activity : ComponentActivity() {
    private lateinit var viewModel: Feature193ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature193Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature193ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature193Screen() {
    Text(
        text = "Feature 193",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature193ScreenPreview() {
    MaterialTheme {
        Feature193Screen()
    }
}
