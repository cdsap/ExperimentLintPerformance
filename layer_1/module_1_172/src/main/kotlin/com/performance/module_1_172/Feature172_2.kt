package com.performance.module_1_172

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
import com.performance.module_1_172.R
import com.performance.module_0_13.Feature13ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_81.Feature81ViewModel
import com.performance.module_0_2.Feature2ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_112.Feature112ViewModel
import com.performance.module_0_24.Feature24ViewModel
import com.performance.module_0_38.Feature38ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_52.Feature52ViewModel
import com.performance.module_0_48.Feature48ViewModel
import com.performance.module_0_31.Feature31ViewModel
import com.performance.module_0_60.Feature60ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_126.Feature126ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_7.Feature7ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_106.Feature106ViewModel
import com.performance.module_0_41.Feature41ViewModel
import com.performance.module_0_23.Feature23ViewModel
import com.performance.module_0_46.Feature46ViewModel
import com.performance.module_0_116.Feature116ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_129.Feature129ViewModel
import com.performance.module_0_8.Feature8ViewModel
import com.performance.module_0_83.Feature83ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_100.Feature100ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_16.Feature16ViewModel
import com.performance.module_0_91.Feature91ViewModel
import com.performance.module_0_127.Feature127ViewModel
import com.performance.module_0_6.Feature6ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_37.Feature37ViewModel
import com.performance.module_0_62.Feature62ViewModel
import com.performance.module_0_49.Feature49ViewModel
import com.performance.module_0_124.Feature124ViewModel
import com.performance.module_0_17.Feature17ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_44.Feature44ViewModel
import com.performance.module_0_39.Feature39ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_54.Feature54ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_27.Feature27ViewModel
import com.performance.module_0_72.Feature72ViewModel
import com.performance.module_0_58.Feature58ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_70.Feature70ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_104.Feature104ViewModel

class Feature172Activity : ComponentActivity() {
    private lateinit var viewModel: Feature172ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature172Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature172ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature172Screen() {
    Text(
        text = "Feature 172",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature172ScreenPreview() {
    MaterialTheme {
        Feature172Screen()
    }
}
