package com.performance.module_1_170

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
import com.performance.module_1_170.R
import com.performance.module_0_115.Feature115ViewModel
import com.performance.module_0_1.Feature1ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_69.Feature69ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_79.Feature79ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_121.Feature121ViewModel
import com.performance.module_0_107.Feature107ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_73.Feature73ViewModel
import com.performance.module_0_90.Feature90ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_85.Feature85ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_12.Feature12ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_32.Feature32ViewModel
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_71.Feature71ViewModel
import com.performance.module_0_74.Feature74ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_77.Feature77ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_55.Feature55ViewModel
import com.performance.module_0_113.Feature113ViewModel
import com.performance.module_0_25.Feature25ViewModel

class Feature170Activity : ComponentActivity() {
    private lateinit var viewModel: Feature170ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature170Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature170ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature170Screen() {
    Text(
        text = "Feature 170",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature170ScreenPreview() {
    MaterialTheme {
        Feature170Screen()
    }
}
