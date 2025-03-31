package com.performance.module_4_76

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
import com.performance.module_4_76.R
import com.performance.module_3_72.Feature72ViewModel
import com.performance.module_3_66.Feature66ViewModel
import com.performance.module_3_53.Feature53ViewModel
import com.performance.module_3_51.Feature51ViewModel
import com.performance.module_3_54.Feature54ViewModel
import com.performance.module_3_61.Feature61ViewModel
import com.performance.module_3_63.Feature63ViewModel
import com.performance.module_3_74.Feature74ViewModel
import com.performance.module_3_69.Feature69ViewModel
import com.performance.module_3_71.Feature71ViewModel
import com.performance.module_3_56.Feature56ViewModel

class Feature76Activity : ComponentActivity() {
    private lateinit var viewModel: Feature76ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature76Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature76ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature76Screen() {
    Text(
        text = "Feature 76",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature76ScreenPreview() {
    MaterialTheme {
        Feature76Screen()
    }
}
