package com.performance.module_1_133

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
import com.performance.module_1_133.R
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_110.Feature110ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_10.Feature10ViewModel

class Feature133Activity : ComponentActivity() {
    private lateinit var viewModel: Feature133ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature133Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature133ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature133Screen() {
    Text(
        text = "Feature 133",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature133ScreenPreview() {
    MaterialTheme {
        Feature133Screen()
    }
}
