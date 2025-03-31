package com.performance.module_1_164

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
import com.performance.module_1_164.R
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_66.Feature66ViewModel

class Feature164Activity : ComponentActivity() {
    private lateinit var viewModel: Feature164ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature164Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature164ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature164Screen() {
    Text(
        text = "Feature 164",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature164ScreenPreview() {
    MaterialTheme {
        Feature164Screen()
    }
}
