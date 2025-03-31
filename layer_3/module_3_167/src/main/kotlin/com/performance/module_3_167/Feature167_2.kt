package com.performance.module_3_167

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
import com.performance.module_3_167.R
import com.performance.module_2_153.Feature153ViewModel
import com.performance.module_2_146.Feature146ViewModel
import com.performance.module_2_134.Feature134ViewModel
import com.performance.module_2_140.Feature140ViewModel
import com.performance.module_2_149.Feature149ViewModel

class Feature167Activity : ComponentActivity() {
    private lateinit var viewModel: Feature167ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature167Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature167ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature167Screen() {
    Text(
        text = "Feature 167",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature167ScreenPreview() {
    MaterialTheme {
        Feature167Screen()
    }
}
