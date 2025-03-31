package com.performance.module_1_147

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
import com.performance.module_1_147.R
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_88.Feature88ViewModel

class Feature147Activity : ComponentActivity() {
    private lateinit var viewModel: Feature147ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature147Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature147ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature147Screen() {
    Text(
        text = "Feature 147",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature147ScreenPreview() {
    MaterialTheme {
        Feature147Screen()
    }
}
