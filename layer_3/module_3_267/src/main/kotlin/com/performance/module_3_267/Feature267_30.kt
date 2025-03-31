package com.performance.module_3_267

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature267ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature267State0.INITIAL)
    val state: StateFlow<Feature267State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature267State0.LOADING
            // Simulate some work
            _state.value = Feature267State0.SUCCESS
        }
    }
}
