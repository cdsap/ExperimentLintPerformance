package com.performance.module_2_211

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Feature211Screen0(
    modifier: Modifier = Modifier,
    viewModel: Feature211ViewModel0 = viewModel()
) {
    val state by viewModel.state.collectAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = when (state) {
                Feature211State0.INITIAL -> "Initial"
                Feature211State0.LOADING -> "Loading..."
                Feature211State0.SUCCESS -> "Success"
                Feature211State0.ERROR -> "Error"
                Feature211State0.COMPLETED -> "Completed"
            },
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Feature211Screen0Preview() {
    MaterialTheme {
        Feature211Screen0()
    }
}
