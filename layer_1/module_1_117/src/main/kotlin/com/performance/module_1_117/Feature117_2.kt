package com.performance.module_1_117

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
import com.performance.module_1_117.R
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_30.Feature30ViewModel

class Feature117Activity : ComponentActivity() {
    private lateinit var viewModel: Feature117ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature117Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature117ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature117Screen() {
    Text(
        text = "Feature 117",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature117ScreenPreview() {
    MaterialTheme {
        Feature117Screen()
    }
}
