package com.performance.module_5_301

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
import com.performance.module_5_301.R
import com.performance.module_4_297.Feature297ViewModel
import com.performance.module_4_276.Feature276ViewModel
import com.performance.module_4_295.Feature295ViewModel
import com.performance.module_4_298.Feature298ViewModel
import com.performance.module_4_293.Feature293ViewModel
import com.performance.module_4_280.Feature280ViewModel
import com.performance.module_4_279.Feature279ViewModel
import com.performance.module_4_288.Feature288ViewModel
import com.performance.module_4_282.Feature282ViewModel
import com.performance.module_4_285.Feature285ViewModel
import com.performance.module_4_292.Feature292ViewModel
import com.performance.module_4_283.Feature283ViewModel
import com.performance.module_4_290.Feature290ViewModel

class Feature301Activity : ComponentActivity() {
    private lateinit var viewModel: Feature301ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature301Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature301ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature301Screen() {
    Text(
        text = "Feature 301",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature301ScreenPreview() {
    MaterialTheme {
        Feature301Screen()
    }
}
