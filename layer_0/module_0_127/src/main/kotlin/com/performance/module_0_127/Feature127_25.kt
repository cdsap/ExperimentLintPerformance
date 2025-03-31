package com.performance.module_0_127

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
fun Feature127Screen1(
    modifier: Modifier = Modifier,
    viewModel: Feature127ViewModel1 = viewModel()
) {
    val state by viewModel.state.collectAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = when (state) {
                Feature127State0.INITIAL -> "Initial"
                Feature127State0.LOADING -> "Loading..."
                Feature127State0.SUCCESS -> "Success"
                Feature127State0.ERROR -> "Error"
                Feature127State0.COMPLETED -> "Completed"
            },
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Feature127Screen1Preview() {
    MaterialTheme {
        Feature127Screen1()
    }
}
