package com.performance.module_2_148

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
import com.performance.module_2_148.R
import com.performance.module_1_112.Feature112ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_90.Feature90ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_106.Feature106ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_127.Feature127ViewModel
import com.performance.module_1_103.Feature103ViewModel
import com.performance.module_1_123.Feature123ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_94.Feature94ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_107.Feature107ViewModel
import com.performance.module_1_102.Feature102ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_120.Feature120ViewModel
import com.performance.module_1_122.Feature122ViewModel
import com.performance.module_1_113.Feature113ViewModel

class Feature148Activity : ComponentActivity() {
    private lateinit var viewModel: Feature148ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature148Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature148ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature148Screen() {
    Text(
        text = "Feature 148",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature148ScreenPreview() {
    MaterialTheme {
        Feature148Screen()
    }
}
