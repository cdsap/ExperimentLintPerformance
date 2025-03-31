package com.performance.module_1_178

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
import com.performance.module_1_178.R
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_17.Feature17ViewModel

class Feature178Activity : ComponentActivity() {
    private lateinit var viewModel: Feature178ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature178Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature178ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature178Screen() {
    Text(
        text = "Feature 178",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature178ScreenPreview() {
    MaterialTheme {
        Feature178Screen()
    }
}
