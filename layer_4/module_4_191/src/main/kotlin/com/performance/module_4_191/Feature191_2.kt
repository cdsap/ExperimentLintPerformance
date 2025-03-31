package com.performance.module_4_191

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
import com.performance.module_4_191.R
import com.performance.module_3_175.Feature175ViewModel
import com.performance.module_3_163.Feature163ViewModel
import com.performance.module_3_182.Feature182ViewModel
import com.performance.module_3_177.Feature177ViewModel
import com.performance.module_3_166.Feature166ViewModel
import com.performance.module_3_171.Feature171ViewModel

class Feature191Activity : ComponentActivity() {
    private lateinit var viewModel: Feature191ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature191Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature191ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature191Screen() {
    Text(
        text = "Feature 191",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature191ScreenPreview() {
    MaterialTheme {
        Feature191Screen()
    }
}
