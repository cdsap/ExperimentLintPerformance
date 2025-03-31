package com.performance.module_3_257

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
import com.performance.module_3_257.R
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_231.Feature231ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_208.Feature208ViewModel
import com.performance.module_2_225.Feature225ViewModel
import com.performance.module_2_238.Feature238ViewModel

class Feature257Activity : ComponentActivity() {
    private lateinit var viewModel: Feature257ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature257Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature257ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature257Screen() {
    Text(
        text = "Feature 257",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature257ScreenPreview() {
    MaterialTheme {
        Feature257Screen()
    }
}
