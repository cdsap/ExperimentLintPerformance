package com.performance.module_4_198

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
import com.performance.module_4_198.R
import com.performance.module_3_181.Feature181ViewModel
import com.performance.module_3_170.Feature170ViewModel
import com.performance.module_3_167.Feature167ViewModel
import com.performance.module_3_165.Feature165ViewModel
import com.performance.module_3_172.Feature172ViewModel
import com.performance.module_3_182.Feature182ViewModel
import com.performance.module_3_180.Feature180ViewModel
import com.performance.module_3_173.Feature173ViewModel
import com.performance.module_3_183.Feature183ViewModel
import com.performance.module_3_169.Feature169ViewModel

class Feature198Activity : ComponentActivity() {
    private lateinit var viewModel: Feature198ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature198Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature198ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature198Screen() {
    Text(
        text = "Feature 198",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature198ScreenPreview() {
    MaterialTheme {
        Feature198Screen()
    }
}
