package com.performance.module_1_155

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
import com.performance.module_1_155.R
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_83.Feature83ViewModel

class Feature155Activity : ComponentActivity() {
    private lateinit var viewModel: Feature155ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature155Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature155ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature155Screen() {
    Text(
        text = "Feature 155",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature155ScreenPreview() {
    MaterialTheme {
        Feature155Screen()
    }
}
