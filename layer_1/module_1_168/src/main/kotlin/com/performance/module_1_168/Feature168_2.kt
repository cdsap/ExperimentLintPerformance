package com.performance.module_1_168

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
import com.performance.module_1_168.R
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_86.Feature86ViewModel

class Feature168Activity : ComponentActivity() {
    private lateinit var viewModel: Feature168ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature168Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature168ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature168Screen() {
    Text(
        text = "Feature 168",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature168ScreenPreview() {
    MaterialTheme {
        Feature168Screen()
    }
}
