package com.performance.module_1_197

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
import com.performance.module_1_197.R
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_70.Feature70ViewModel

class Feature197Activity : ComponentActivity() {
    private lateinit var viewModel: Feature197ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature197Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature197ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature197Screen() {
    Text(
        text = "Feature 197",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature197ScreenPreview() {
    MaterialTheme {
        Feature197Screen()
    }
}
