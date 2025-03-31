package com.performance.module_1_168

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature168ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature168State0.INITIAL)
    val state: StateFlow<Feature168State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature168State0.LOADING
            // Simulate some work
            _state.value = Feature168State0.SUCCESS
        }
    }
}
