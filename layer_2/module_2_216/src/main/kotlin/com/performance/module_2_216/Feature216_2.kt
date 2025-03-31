package com.performance.module_2_216

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
import com.performance.module_2_216.R
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_172.Feature172ViewModel
import com.performance.module_1_173.Feature173ViewModel
import com.performance.module_1_142.Feature142ViewModel
import com.performance.module_1_144.Feature144ViewModel
import com.performance.module_1_153.Feature153ViewModel
import com.performance.module_1_189.Feature189ViewModel
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_181.Feature181ViewModel
import com.performance.module_1_152.Feature152ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_164.Feature164ViewModel
import com.performance.module_1_190.Feature190ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_168.Feature168ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_174.Feature174ViewModel
import com.performance.module_1_188.Feature188ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_162.Feature162ViewModel
import com.performance.module_1_193.Feature193ViewModel

class Feature216Activity : ComponentActivity() {
    private lateinit var viewModel: Feature216ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature216Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature216ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature216Screen() {
    Text(
        text = "Feature 216",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature216ScreenPreview() {
    MaterialTheme {
        Feature216Screen()
    }
}
