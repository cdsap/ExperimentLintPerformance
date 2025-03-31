package com.performance.module_1_99

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature99ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature99State0.INITIAL)
    val state: StateFlow<Feature99State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature99State0.LOADING
            // Simulate some work
            _state.value = Feature99State0.SUCCESS
        }
    }
}
