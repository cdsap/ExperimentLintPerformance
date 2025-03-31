package com.performance.module_0_123

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature123ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature123State0.INITIAL)
    val state: StateFlow<Feature123State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature123State0.LOADING
            // Simulate some work
            _state.value = Feature123State0.SUCCESS
        }
    }
}
