package com.performance.module_1_188

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature188ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature188State0.INITIAL)
    val state: StateFlow<Feature188State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature188State0.LOADING
            // Simulate some work
            _state.value = Feature188State0.SUCCESS
        }
    }
}
