package com.performance.module_2_158

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
import com.performance.module_2_158.R
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_97.Feature97ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_105.Feature105ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_117.Feature117ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_120.Feature120ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_107.Feature107ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_111.Feature111ViewModel

class Feature158Activity : ComponentActivity() {
    private lateinit var viewModel: Feature158ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature158Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature158ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature158Screen() {
    Text(
        text = "Feature 158",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature158ScreenPreview() {
    MaterialTheme {
        Feature158Screen()
    }
}
