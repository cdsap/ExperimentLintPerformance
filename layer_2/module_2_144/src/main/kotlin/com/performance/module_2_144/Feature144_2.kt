package com.performance.module_2_144

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
import com.performance.module_2_144.R
import com.performance.module_1_129.Feature129ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_119.Feature119ViewModel
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_91.Feature91ViewModel
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_107.Feature107ViewModel
import com.performance.module_1_115.Feature115ViewModel
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_105.Feature105ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_94.Feature94ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_124.Feature124ViewModel

class Feature144Activity : ComponentActivity() {
    private lateinit var viewModel: Feature144ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature144Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature144ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature144Screen() {
    Text(
        text = "Feature 144",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature144ScreenPreview() {
    MaterialTheme {
        Feature144Screen()
    }
}
