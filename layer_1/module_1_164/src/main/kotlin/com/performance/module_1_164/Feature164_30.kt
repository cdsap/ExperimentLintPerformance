package com.performance.module_1_164

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature164ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature164State0.INITIAL)
    val state: StateFlow<Feature164State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature164State0.LOADING
            // Simulate some work
            _state.value = Feature164State0.SUCCESS
        }
    }
}
