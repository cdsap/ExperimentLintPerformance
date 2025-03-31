package com.performance.module_1_150

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature150ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature150State0.INITIAL)
    val state: StateFlow<Feature150State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature150State0.LOADING
            // Simulate some work
            _state.value = Feature150State0.SUCCESS
        }
    }
}
