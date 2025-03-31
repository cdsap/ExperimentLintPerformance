package com.performance.module_2_205

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
import com.performance.module_2_205.R
import com.performance.module_1_141.Feature141ViewModel
import com.performance.module_1_192.Feature192ViewModel
import com.performance.module_1_183.Feature183ViewModel
import com.performance.module_1_193.Feature193ViewModel
import com.performance.module_1_182.Feature182ViewModel
import com.performance.module_1_175.Feature175ViewModel
import com.performance.module_1_163.Feature163ViewModel
import com.performance.module_1_149.Feature149ViewModel
import com.performance.module_1_185.Feature185ViewModel
import com.performance.module_1_176.Feature176ViewModel
import com.performance.module_1_195.Feature195ViewModel
import com.performance.module_1_197.Feature197ViewModel
import com.performance.module_1_171.Feature171ViewModel
import com.performance.module_1_159.Feature159ViewModel
import com.performance.module_1_166.Feature166ViewModel
import com.performance.module_1_165.Feature165ViewModel
import com.performance.module_1_177.Feature177ViewModel
import com.performance.module_1_133.Feature133ViewModel
import com.performance.module_1_191.Feature191ViewModel
import com.performance.module_1_196.Feature196ViewModel
import com.performance.module_1_151.Feature151ViewModel
import com.performance.module_1_154.Feature154ViewModel
import com.performance.module_1_150.Feature150ViewModel

class Feature205Activity : ComponentActivity() {
    private lateinit var viewModel: Feature205ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature205Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature205ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature205Screen() {
    Text(
        text = "Feature 205",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature205ScreenPreview() {
    MaterialTheme {
        Feature205Screen()
    }
}
