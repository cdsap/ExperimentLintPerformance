package com.performance.module_1_151

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
import com.performance.module_1_151.R
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_122.Feature122ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_63.Feature63ViewModel

class Feature151Activity : ComponentActivity() {
    private lateinit var viewModel: Feature151ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature151Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature151ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature151Screen() {
    Text(
        text = "Feature 151",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature151ScreenPreview() {
    MaterialTheme {
        Feature151Screen()
    }
}
