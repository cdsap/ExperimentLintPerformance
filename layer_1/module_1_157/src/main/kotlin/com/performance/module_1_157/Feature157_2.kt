package com.performance.module_1_157

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
import com.performance.module_1_157.R
import com.performance.module_0_111.Feature111ViewModel
import com.performance.module_0_63.Feature63ViewModel
import com.performance.module_0_25.Feature25ViewModel
import com.performance.module_0_10.Feature10ViewModel
import com.performance.module_0_92.Feature92ViewModel
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_99.Feature99ViewModel
import com.performance.module_0_118.Feature118ViewModel
import com.performance.module_0_53.Feature53ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_103.Feature103ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_67.Feature67ViewModel
import com.performance.module_0_50.Feature50ViewModel
import com.performance.module_0_114.Feature114ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_109.Feature109ViewModel
import com.performance.module_0_105.Feature105ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_34.Feature34ViewModel
import com.performance.module_0_5.Feature5ViewModel
import com.performance.module_0_78.Feature78ViewModel
import com.performance.module_0_84.Feature84ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_97.Feature97ViewModel
import com.performance.module_0_119.Feature119ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_96.Feature96ViewModel
import com.performance.module_0_18.Feature18ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_29.Feature29ViewModel
import com.performance.module_0_22.Feature22ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_57.Feature57ViewModel
import com.performance.module_0_51.Feature51ViewModel
import com.performance.module_0_98.Feature98ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_87.Feature87ViewModel

class Feature157Activity : ComponentActivity() {
    private lateinit var viewModel: Feature157ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature157Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature157ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature157Screen() {
    Text(
        text = "Feature 157",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature157ScreenPreview() {
    MaterialTheme {
        Feature157Screen()
    }
}
