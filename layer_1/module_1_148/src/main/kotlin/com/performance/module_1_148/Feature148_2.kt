package com.performance.module_1_148

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
import com.performance.module_1_148.R
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_128.Feature128ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_114.Feature114ViewModel

class Feature148Activity : ComponentActivity() {
    private lateinit var viewModel: Feature148ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature148Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature148ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature148Screen() {
    Text(
        text = "Feature 148",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature148ScreenPreview() {
    MaterialTheme {
        Feature148Screen()
    }
}
