package com.performance.module_4_283

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature283ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature283State0.INITIAL)
    val state: StateFlow<Feature283State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature283State0.LOADING
            // Simulate some work
            _state.value = Feature283State0.SUCCESS
        }
    }
}
