package com.performance.module_3_265

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
import com.performance.module_3_265.R
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_235.Feature235ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_205.Feature205ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_232.Feature232ViewModel
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_239.Feature239ViewModel

class Feature265Activity : ComponentActivity() {
    private lateinit var viewModel: Feature265ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature265Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature265ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature265Screen() {
    Text(
        text = "Feature 265",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature265ScreenPreview() {
    MaterialTheme {
        Feature265Screen()
    }
}
