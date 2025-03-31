package com.performance.module_1_198

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
import com.performance.module_1_198.R
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_53.Feature53ViewModel

class Feature198Activity : ComponentActivity() {
    private lateinit var viewModel: Feature198ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature198Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature198ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature198Screen() {
    Text(
        text = "Feature 198",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature198ScreenPreview() {
    MaterialTheme {
        Feature198Screen()
    }
}
