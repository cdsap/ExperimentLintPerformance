package com.performance.module_1_187

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
import com.performance.module_1_187.R
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_122.Feature122ViewModel

class Feature187Activity : ComponentActivity() {
    private lateinit var viewModel: Feature187ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature187Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature187ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature187Screen() {
    Text(
        text = "Feature 187",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature187ScreenPreview() {
    MaterialTheme {
        Feature187Screen()
    }
}
