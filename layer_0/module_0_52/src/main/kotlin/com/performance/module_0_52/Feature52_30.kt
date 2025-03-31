package com.performance.module_0_52

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature52ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature52State0.INITIAL)
    val state: StateFlow<Feature52State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature52State0.LOADING
            // Simulate some work
            _state.value = Feature52State0.SUCCESS
        }
    }
}
