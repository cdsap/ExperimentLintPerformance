package com.performance.module_4_187

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
import com.performance.module_4_187.R
import com.performance.module_3_176.Feature176ViewModel
import com.performance.module_3_168.Feature168ViewModel
import com.performance.module_3_170.Feature170ViewModel
import com.performance.module_3_167.Feature167ViewModel
import com.performance.module_3_163.Feature163ViewModel
import com.performance.module_3_183.Feature183ViewModel
import com.performance.module_3_175.Feature175ViewModel
import com.performance.module_3_165.Feature165ViewModel
import com.performance.module_3_181.Feature181ViewModel

class Feature187Activity : ComponentActivity() {
    private lateinit var viewModel: Feature187ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature187Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature187ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature187Screen() {
    Text(
        text = "Feature 187",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature187ScreenPreview() {
    MaterialTheme {
        Feature187Screen()
    }
}
