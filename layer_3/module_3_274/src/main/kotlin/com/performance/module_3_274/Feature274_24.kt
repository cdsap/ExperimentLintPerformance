package com.performance.module_3_274

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature274ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature274State0.INITIAL)
    val state: StateFlow<Feature274State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature274State0.LOADING
            // Simulate some work
            _state.value = Feature274State0.SUCCESS
        }
    }
}
