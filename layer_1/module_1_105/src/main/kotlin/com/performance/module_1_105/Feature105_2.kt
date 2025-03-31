package com.performance.module_1_105

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
import com.performance.module_1_105.R
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_45.Feature45ViewModel

class Feature105Activity : ComponentActivity() {
    private lateinit var viewModel: Feature105ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature105Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature105ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature105Screen() {
    Text(
        text = "Feature 105",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature105ScreenPreview() {
    MaterialTheme {
        Feature105Screen()
    }
}
