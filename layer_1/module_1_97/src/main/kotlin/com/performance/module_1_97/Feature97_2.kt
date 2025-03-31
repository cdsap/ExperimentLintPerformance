package com.performance.module_1_97

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
import com.performance.module_1_97.R
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_42.Feature42ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_19.Feature19ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_86.Feature86ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_64.Feature64ViewModel
import com.performance.module_0_87.Feature87ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_66.Feature66ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_62.Feature62ViewModel

class Feature97Activity : ComponentActivity() {
    private lateinit var viewModel: Feature97ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature97Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature97ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature97Screen() {
    Text(
        text = "Feature 97",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature97ScreenPreview() {
    MaterialTheme {
        Feature97Screen()
    }
}
