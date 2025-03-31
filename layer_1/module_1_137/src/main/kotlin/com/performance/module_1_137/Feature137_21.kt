package com.performance.module_1_137

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature137ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature137State0.INITIAL)
    val state: StateFlow<Feature137State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature137State0.LOADING
            // Simulate some work
            _state.value = Feature137State0.SUCCESS
        }
    }
}
