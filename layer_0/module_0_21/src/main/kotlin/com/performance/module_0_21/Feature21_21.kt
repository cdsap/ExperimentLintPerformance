package com.performance.module_0_21

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature21ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature21State0.INITIAL)
    val state: StateFlow<Feature21State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature21State0.LOADING
            // Simulate some work
            _state.value = Feature21State0.SUCCESS
        }
    }
}
