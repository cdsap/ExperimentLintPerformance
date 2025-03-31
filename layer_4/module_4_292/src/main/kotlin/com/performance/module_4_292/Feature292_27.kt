package com.performance.module_4_292

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature292ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature292State0.INITIAL)
    val state: StateFlow<Feature292State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature292State0.LOADING
            // Simulate some work
            _state.value = Feature292State0.SUCCESS
        }
    }
}
