package com.performance.module_2_140

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
import com.performance.module_2_140.R
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_92.Feature92ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_101.Feature101ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_102.Feature102ViewModel

class Feature140Activity : ComponentActivity() {
    private lateinit var viewModel: Feature140ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature140Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature140ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature140Screen() {
    Text(
        text = "Feature 140",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature140ScreenPreview() {
    MaterialTheme {
        Feature140Screen()
    }
}
