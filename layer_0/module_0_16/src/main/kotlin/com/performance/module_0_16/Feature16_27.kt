package com.performance.module_0_16

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature16ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature16State0.INITIAL)
    val state: StateFlow<Feature16State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature16State0.LOADING
            // Simulate some work
            _state.value = Feature16State0.SUCCESS
        }
    }
}
