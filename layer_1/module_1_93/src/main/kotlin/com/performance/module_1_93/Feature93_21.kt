package com.performance.module_1_93

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature93ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature93State0.INITIAL)
    val state: StateFlow<Feature93State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature93State0.LOADING
            // Simulate some work
            _state.value = Feature93State0.SUCCESS
        }
    }
}
