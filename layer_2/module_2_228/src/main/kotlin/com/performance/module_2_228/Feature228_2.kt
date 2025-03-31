package com.performance.module_2_228

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
import com.performance.module_2_228.R
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_161.Feature161ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_171.Feature171ViewModel

class Feature228Activity : ComponentActivity() {
    private lateinit var viewModel: Feature228ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature228Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature228ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature228Screen() {
    Text(
        text = "Feature 228",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature228ScreenPreview() {
    MaterialTheme {
        Feature228Screen()
    }
}
