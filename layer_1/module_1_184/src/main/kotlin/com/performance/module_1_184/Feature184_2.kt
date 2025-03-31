package com.performance.module_1_184

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
import com.performance.module_1_184.R
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_120.Feature120ViewModel

class Feature184Activity : ComponentActivity() {
    private lateinit var viewModel: Feature184ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature184Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature184ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature184Screen() {
    Text(
        text = "Feature 184",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature184ScreenPreview() {
    MaterialTheme {
        Feature184Screen()
    }
}
