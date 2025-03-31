package com.performance.module_0_100

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature100ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature100State0.INITIAL)
    val state: StateFlow<Feature100State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature100State0.LOADING
            // Simulate some work
            _state.value = Feature100State0.SUCCESS
        }
    }
}
