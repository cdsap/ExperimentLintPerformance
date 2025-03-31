package com.performance.module_1_108

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
import com.performance.module_1_108.R
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_35.Feature35ViewModel

class Feature108Activity : ComponentActivity() {
    private lateinit var viewModel: Feature108ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature108Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature108ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature108Screen() {
    Text(
        text = "Feature 108",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature108ScreenPreview() {
    MaterialTheme {
        Feature108Screen()
    }
}
