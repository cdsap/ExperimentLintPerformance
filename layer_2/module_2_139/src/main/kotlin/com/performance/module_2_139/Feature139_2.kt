package com.performance.module_2_139

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
import com.performance.module_2_139.R
import com.performance.module_1_124.Feature124ViewModel
import com.performance.module_1_125.Feature125ViewModel
import com.performance.module_1_130.Feature130ViewModel
import com.performance.module_1_119.Feature119ViewModel
import com.performance.module_1_111.Feature111ViewModel
import com.performance.module_1_99.Feature99ViewModel
import com.performance.module_1_131.Feature131ViewModel
import com.performance.module_1_98.Feature98ViewModel
import com.performance.module_1_121.Feature121ViewModel
import com.performance.module_1_104.Feature104ViewModel
import com.performance.module_1_89.Feature89ViewModel
import com.performance.module_1_96.Feature96ViewModel
import com.performance.module_1_100.Feature100ViewModel
import com.performance.module_1_94.Feature94ViewModel
import com.performance.module_1_116.Feature116ViewModel
import com.performance.module_1_109.Feature109ViewModel
import com.performance.module_1_108.Feature108ViewModel
import com.performance.module_1_90.Feature90ViewModel

class Feature139Activity : ComponentActivity() {
    private lateinit var viewModel: Feature139ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature139Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature139ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature139Screen() {
    Text(
        text = "Feature 139",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature139ScreenPreview() {
    MaterialTheme {
        Feature139Screen()
    }
}
