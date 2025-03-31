package com.performance.module_1_137

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
import com.performance.module_1_137.R
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_123.Feature123ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_126.Feature126ViewModel

class Feature137Activity : ComponentActivity() {
    private lateinit var viewModel: Feature137ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature137Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature137ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature137Screen() {
    Text(
        text = "Feature 137",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature137ScreenPreview() {
    MaterialTheme {
        Feature137Screen()
    }
}
