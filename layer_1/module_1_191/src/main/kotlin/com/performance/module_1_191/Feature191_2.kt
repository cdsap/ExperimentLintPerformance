package com.performance.module_1_191

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
import com.performance.module_1_191.R
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_72.Feature72ViewModel

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
