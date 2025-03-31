package com.performance.module_1_135

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature135ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature135State0.INITIAL)
    val state: StateFlow<Feature135State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature135State0.LOADING
            // Simulate some work
            _state.value = Feature135State0.SUCCESS
        }
    }
}
