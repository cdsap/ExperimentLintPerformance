package com.performance.module_4_82

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
import com.performance.module_4_82.R
import com.performance.module_3_56.Feature56ViewModel
import com.performance.module_3_60.Feature60ViewModel
import com.performance.module_3_54.Feature54ViewModel
import com.performance.module_3_68.Feature68ViewModel
import com.performance.module_3_49.Feature49ViewModel
import com.performance.module_3_59.Feature59ViewModel
import com.performance.module_3_73.Feature73ViewModel
import com.performance.module_3_50.Feature50ViewModel
import com.performance.module_3_64.Feature64ViewModel
import com.performance.module_3_53.Feature53ViewModel
import com.performance.module_3_63.Feature63ViewModel
import com.performance.module_3_61.Feature61ViewModel

class Feature82Activity : ComponentActivity() {
    private lateinit var viewModel: Feature82ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature82Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature82ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature82Screen() {
    Text(
        text = "Feature 82",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature82ScreenPreview() {
    MaterialTheme {
        Feature82Screen()
    }
}
