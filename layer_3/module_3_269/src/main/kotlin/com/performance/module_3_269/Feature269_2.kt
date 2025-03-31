package com.performance.module_3_269

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
import com.performance.module_3_269.R
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_224.Feature224ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_222.Feature222ViewModel
import com.performance.module_2_234.Feature234ViewModel
import com.performance.module_2_207.Feature207ViewModel

class Feature269Activity : ComponentActivity() {
    private lateinit var viewModel: Feature269ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature269Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature269ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature269Screen() {
    Text(
        text = "Feature 269",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature269ScreenPreview() {
    MaterialTheme {
        Feature269Screen()
    }
}
