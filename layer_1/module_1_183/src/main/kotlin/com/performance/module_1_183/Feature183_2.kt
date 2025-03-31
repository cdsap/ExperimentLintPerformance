package com.performance.module_1_183

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
import com.performance.module_1_183.R
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_56.Feature56ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_113.Feature113ViewModel

class Feature183Activity : ComponentActivity() {
    private lateinit var viewModel: Feature183ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature183Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature183ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature183Screen() {
    Text(
        text = "Feature 183",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature183ScreenPreview() {
    MaterialTheme {
        Feature183Screen()
    }
}
