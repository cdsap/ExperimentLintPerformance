package com.performance.module_1_173

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
import com.performance.module_1_173.R
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_112.Feature112ViewModel

class Feature173Activity : ComponentActivity() {
    private lateinit var viewModel: Feature173ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature173Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature173ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature173Screen() {
    Text(
        text = "Feature 173",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature173ScreenPreview() {
    MaterialTheme {
        Feature173Screen()
    }
}
