package com.performance.module_1_190

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature190ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature190State0.INITIAL)
    val state: StateFlow<Feature190State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature190State0.LOADING
            // Simulate some work
            _state.value = Feature190State0.SUCCESS
        }
    }
}
