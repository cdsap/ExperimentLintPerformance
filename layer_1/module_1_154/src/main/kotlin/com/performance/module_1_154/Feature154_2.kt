package com.performance.module_1_154

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
import com.performance.module_1_154.R
import com.performance.module_0_95.Feature95ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_104.Feature104ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_76.Feature76ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_89.Feature89ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_35.Feature35ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_117.Feature117ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_4.Feature4ViewModel
import com.performance.module_0_122.Feature122ViewModel

class Feature154Activity : ComponentActivity() {
    private lateinit var viewModel: Feature154ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature154Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature154ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature154Screen() {
    Text(
        text = "Feature 154",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature154ScreenPreview() {
    MaterialTheme {
        Feature154Screen()
    }
}
