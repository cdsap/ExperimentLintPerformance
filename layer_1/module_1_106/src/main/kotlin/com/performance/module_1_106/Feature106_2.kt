package com.performance.module_1_106

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
import com.performance.module_1_106.R
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_76.Feature76ViewModel

class Feature106Activity : ComponentActivity() {
    private lateinit var viewModel: Feature106ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature106Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature106ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature106Screen() {
    Text(
        text = "Feature 106",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature106ScreenPreview() {
    MaterialTheme {
        Feature106Screen()
    }
}
