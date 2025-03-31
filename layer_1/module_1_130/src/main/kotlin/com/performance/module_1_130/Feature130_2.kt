package com.performance.module_1_130

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
import com.performance.module_1_130.R
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_33.Feature33ViewModel

class Feature130Activity : ComponentActivity() {
    private lateinit var viewModel: Feature130ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature130Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature130ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature130Screen() {
    Text(
        text = "Feature 130",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature130ScreenPreview() {
    MaterialTheme {
        Feature130Screen()
    }
}
