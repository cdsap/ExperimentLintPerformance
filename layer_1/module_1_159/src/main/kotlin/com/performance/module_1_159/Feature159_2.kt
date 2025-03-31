package com.performance.module_1_159

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
import com.performance.module_1_159.R
import com.performance.module_0_40.Feature40ViewModel
import com.performance.module_0_28.Feature28ViewModel
import com.performance.module_0_108.Feature108ViewModel
import com.performance.module_0_9.Feature9ViewModel
import com.performance.module_0_94.Feature94ViewModel
import com.performance.module_0_131.Feature131ViewModel
import com.performance.module_0_45.Feature45ViewModel
import com.performance.module_0_21.Feature21ViewModel
import com.performance.module_0_101.Feature101ViewModel
import com.performance.module_0_30.Feature30ViewModel
import com.performance.module_0_130.Feature130ViewModel
import com.performance.module_0_47.Feature47ViewModel
import com.performance.module_0_15.Feature15ViewModel
import com.performance.module_0_26.Feature26ViewModel
import com.performance.module_0_65.Feature65ViewModel
import com.performance.module_0_36.Feature36ViewModel
import com.performance.module_0_68.Feature68ViewModel
import com.performance.module_0_93.Feature93ViewModel
import com.performance.module_0_20.Feature20ViewModel
import com.performance.module_0_88.Feature88ViewModel
import com.performance.module_0_11.Feature11ViewModel
import com.performance.module_0_43.Feature43ViewModel
import com.performance.module_0_59.Feature59ViewModel
import com.performance.module_0_75.Feature75ViewModel
import com.performance.module_0_3.Feature3ViewModel
import com.performance.module_0_132.Feature132ViewModel
import com.performance.module_0_33.Feature33ViewModel
import com.performance.module_0_14.Feature14ViewModel
import com.performance.module_0_82.Feature82ViewModel
import com.performance.module_0_42.Feature42ViewModel

class Feature159Activity : ComponentActivity() {
    private lateinit var viewModel: Feature159ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature159Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature159ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature159Screen() {
    Text(
        text = "Feature 159",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature159ScreenPreview() {
    MaterialTheme {
        Feature159Screen()
    }
}
