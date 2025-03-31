package com.performance.module_1_180

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
import com.performance.module_1_180.R
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_119.Feature119ViewModel

class Feature180Activity : ComponentActivity() {
    private lateinit var viewModel: Feature180ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature180Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature180ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature180Screen() {
    Text(
        text = "Feature 180",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature180ScreenPreview() {
    MaterialTheme {
        Feature180Screen()
    }
}
