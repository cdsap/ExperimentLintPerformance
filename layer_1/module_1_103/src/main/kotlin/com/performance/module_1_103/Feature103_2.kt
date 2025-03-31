package com.performance.module_1_103

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
import com.performance.module_1_103.R
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_80.Feature80ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_82.Feature82ViewModel

class Feature103Activity : ComponentActivity() {
    private lateinit var viewModel: Feature103ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature103Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature103ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature103Screen() {
    Text(
        text = "Feature 103",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature103ScreenPreview() {
    MaterialTheme {
        Feature103Screen()
    }
}
