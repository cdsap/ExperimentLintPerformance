package com.performance.module_1_167

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
import com.performance.module_1_167.R
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_102.Feature102ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_120.Feature120ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_54.Feature54ViewModel

class Feature167Activity : ComponentActivity() {
    private lateinit var viewModel: Feature167ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature167Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature167ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature167Screen() {
    Text(
        text = "Feature 167",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature167ScreenPreview() {
    MaterialTheme {
        Feature167Screen()
    }
}
