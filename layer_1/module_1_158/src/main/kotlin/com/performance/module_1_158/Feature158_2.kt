package com.performance.module_1_158

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
import com.performance.module_1_158.R
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_61.Feature61ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_125.Feature125ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_114.Feature114ViewModel

class Feature158Activity : ComponentActivity() {
    private lateinit var viewModel: Feature158ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature158Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature158ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature158Screen() {
    Text(
        text = "Feature 158",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature158ScreenPreview() {
    MaterialTheme {
        Feature158Screen()
    }
}
