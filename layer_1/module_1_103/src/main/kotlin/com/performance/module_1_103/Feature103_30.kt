package com.performance.module_1_103

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature103ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature103State0.INITIAL)
    val state: StateFlow<Feature103State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature103State0.LOADING
            // Simulate some work
            _state.value = Feature103State0.SUCCESS
        }
    }
}
