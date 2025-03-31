package com.performance.module_1_186

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
import com.performance.module_1_186.R
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_10.Feature10ViewModel

class Feature186Activity : ComponentActivity() {
    private lateinit var viewModel: Feature186ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature186Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature186ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature186Screen() {
    Text(
        text = "Feature 186",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature186ScreenPreview() {
    MaterialTheme {
        Feature186Screen()
    }
}
