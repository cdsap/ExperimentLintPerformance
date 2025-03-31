package com.performance.module_1_129

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature129ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature129State0.INITIAL)
    val state: StateFlow<Feature129State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature129State0.LOADING
            // Simulate some work
            _state.value = Feature129State0.SUCCESS
        }
    }
}
