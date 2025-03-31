package com.performance.module_3_170

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature170ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature170State0.INITIAL)
    val state: StateFlow<Feature170State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature170State0.LOADING
            // Simulate some work
            _state.value = Feature170State0.SUCCESS
        }
    }
}
