package com.performance.module_3_172

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
import com.performance.module_3_172.R
import com.performance.module_2_148.Feature148ViewModel
import com.performance.module_2_137.Feature137ViewModel
import com.performance.module_2_143.Feature143ViewModel
import com.performance.module_2_156.Feature156ViewModel
import com.performance.module_2_159.Feature159ViewModel
import com.performance.module_2_160.Feature160ViewModel
import com.performance.module_2_150.Feature150ViewModel
import com.performance.module_2_133.Feature133ViewModel
import com.performance.module_2_134.Feature134ViewModel
import com.performance.module_2_141.Feature141ViewModel
import com.performance.module_2_149.Feature149ViewModel

class Feature172Activity : ComponentActivity() {
    private lateinit var viewModel: Feature172ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature172Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature172ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature172Screen() {
    Text(
        text = "Feature 172",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature172ScreenPreview() {
    MaterialTheme {
        Feature172Screen()
    }
}
