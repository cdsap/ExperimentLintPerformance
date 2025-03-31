package com.performance.module_2_152

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
import com.performance.module_2_152.R
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_105.Feature105ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_114.Feature114ViewModel
import com.performance.module_1_91.Feature91ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_117.Feature117ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_118.Feature118ViewModel

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
