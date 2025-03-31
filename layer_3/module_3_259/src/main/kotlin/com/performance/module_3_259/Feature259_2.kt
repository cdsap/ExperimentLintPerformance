package com.performance.module_3_259

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
import com.performance.module_3_259.R
import com.performance.module_2_217.Feature217ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_240.Feature240ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_229.Feature229ViewModel
import com.performance.module_2_236.Feature236ViewModel
import com.performance.module_2_210.Feature210ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_238.Feature238ViewModel
import com.performance.module_2_209.Feature209ViewModel
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_220.Feature220ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_231.Feature231ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_228.Feature228ViewModel
import com.performance.module_2_227.Feature227ViewModel
import com.performance.module_2_213.Feature213ViewModel
import com.performance.module_2_200.Feature200ViewModel

class Feature259Activity : ComponentActivity() {
    private lateinit var viewModel: Feature259ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature259Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature259ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature259Screen() {
    Text(
        text = "Feature 259",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature259ScreenPreview() {
    MaterialTheme {
        Feature259Screen()
    }
}
