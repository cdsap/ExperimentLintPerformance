package com.performance.module_3_57

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature57ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature57State0.INITIAL)
    val state: StateFlow<Feature57State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature57State0.LOADING
            // Simulate some work
            _state.value = Feature57State0.SUCCESS
        }
    }
}
