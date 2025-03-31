package com.performance.module_2_143

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
import com.performance.module_2_143.R
import com.performance.module_1_93.Feature93ViewModel
import com.performance.module_1_110.Feature110ViewModel
import com.performance.module_1_128.Feature128ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_118.Feature118ViewModel
import com.performance.module_1_92.Feature92ViewModel
import com.performance.module_1_103.Feature103ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_101.Feature101ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_132.Feature132ViewModel
import com.performance.module_1_113.Feature113ViewModel
import com.performance.module_1_111.Feature111ViewModel

class Feature143Activity : ComponentActivity() {
    private lateinit var viewModel: Feature143ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature143Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature143ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature143Screen() {
    Text(
        text = "Feature 143",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature143ScreenPreview() {
    MaterialTheme {
        Feature143Screen()
    }
}
