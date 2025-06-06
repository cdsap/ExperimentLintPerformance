package com.performance.module_1_138

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature138ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature138State0.INITIAL)
    val state: StateFlow<Feature138State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature138State0.LOADING
            // Simulate some work
            _state.value = Feature138State0.SUCCESS
        }
    }
}
