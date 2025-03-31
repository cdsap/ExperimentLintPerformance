package com.performance.module_3_251

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
import com.performance.module_3_251.R
import com.performance.module_2_226.Feature226ViewModel
import com.performance.module_2_202.Feature202ViewModel
import com.performance.module_2_239.Feature239ViewModel
import com.performance.module_2_200.Feature200ViewModel
import com.performance.module_2_206.Feature206ViewModel
import com.performance.module_2_212.Feature212ViewModel
import com.performance.module_2_214.Feature214ViewModel
import com.performance.module_2_241.Feature241ViewModel
import com.performance.module_2_207.Feature207ViewModel
import com.performance.module_2_203.Feature203ViewModel
import com.performance.module_2_242.Feature242ViewModel
import com.performance.module_2_223.Feature223ViewModel
import com.performance.module_2_211.Feature211ViewModel
import com.performance.module_2_217.Feature217ViewModel
import com.performance.module_2_233.Feature233ViewModel
import com.performance.module_2_237.Feature237ViewModel
import com.performance.module_2_216.Feature216ViewModel
import com.performance.module_2_231.Feature231ViewModel
import com.performance.module_2_201.Feature201ViewModel
import com.performance.module_2_219.Feature219ViewModel
import com.performance.module_2_208.Feature208ViewModel

class Feature251Activity : ComponentActivity() {
    private lateinit var viewModel: Feature251ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Feature251Screen()
                }
            }
        }

        viewModel = ViewModelProvider(this)[Feature251ViewModel::class.java]
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }
}

@Composable
fun Feature251Screen() {
    Text(
        text = "Feature 251",
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun Feature251ScreenPreview() {
    MaterialTheme {
        Feature251Screen()
    }
}
