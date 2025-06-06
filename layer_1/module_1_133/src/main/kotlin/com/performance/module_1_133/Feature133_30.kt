package com.performance.module_1_133

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature133ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature133State0.INITIAL)
    val state: StateFlow<Feature133State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature133State0.LOADING
            // Simulate some work
            _state.value = Feature133State0.SUCCESS
        }
    }
}
