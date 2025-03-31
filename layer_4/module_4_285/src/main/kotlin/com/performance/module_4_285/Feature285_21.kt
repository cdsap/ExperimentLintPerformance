package com.performance.module_4_285

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature285ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature285State0.INITIAL)
    val state: StateFlow<Feature285State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature285State0.LOADING
            // Simulate some work
            _state.value = Feature285State0.SUCCESS
        }
    }
}
