package com.performance.module_1_145

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
import com.performance.module_1_145.R
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_112.Feature112ViewModel

class Feature145Activity : ComponentActivity() {
    private lateinit var viewModel: Feature145ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature145Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature145ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature145Screen() {
    Text(
        text = "Feature 145",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature145ScreenPreview() {
    MaterialTheme {
        Feature145Screen()
    }
}
