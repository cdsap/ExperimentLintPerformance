package com.performance.module_1_166

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
import com.performance.module_1_166.R
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_6.Feature6ViewModel

class Feature166Activity : ComponentActivity() {
    private lateinit var viewModel: Feature166ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature166Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature166ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature166Screen() {
    Text(
        text = "Feature 166",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature166ScreenPreview() {
    MaterialTheme {
        Feature166Screen()
    }
}
