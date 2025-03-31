package com.performance.module_0_98

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature98ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature98State0.INITIAL)
    val state: StateFlow<Feature98State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature98State0.LOADING
            // Simulate some work
            _state.value = Feature98State0.SUCCESS
        }
    }
}
