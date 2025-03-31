package com.performance.module_2_218

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
import com.performance.module_2_218.R
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_160.Feature160ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_143.Feature143ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_194.Feature194ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_150.Feature150ViewModel
import com.performance.module_1_146.Feature146ViewModel

class Feature218Activity : ComponentActivity() {
    private lateinit var viewModel: Feature218ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature218Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature218ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature218Screen() {
    Text(
        text = "Feature 218",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature218ScreenPreview() {
    MaterialTheme {
        Feature218Screen()
    }
}
