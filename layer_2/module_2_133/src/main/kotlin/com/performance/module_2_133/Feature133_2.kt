package com.performance.module_2_133

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
import com.performance.module_2_133.R
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_103.Feature103ViewModel
import com.performance.module_1_106.Feature106ViewModel
import com.performance.module_1_97.Feature97ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_129.Feature129ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_126.Feature126ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_92.Feature92ViewModel
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_95.Feature95ViewModel
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_120.Feature120ViewModel

class Feature133Activity : ComponentActivity() {
    private lateinit var viewModel: Feature133ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature133Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature133ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature133Screen() {
    Text(
        text = "Feature 133",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature133ScreenPreview() {
    MaterialTheme {
        Feature133Screen()
    }
}
