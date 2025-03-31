package com.performance.module_0_43

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature43ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature43State0.INITIAL)
    val state: StateFlow<Feature43State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature43State0.LOADING
            // Simulate some work
            _state.value = Feature43State0.SUCCESS
        }
    }
}
