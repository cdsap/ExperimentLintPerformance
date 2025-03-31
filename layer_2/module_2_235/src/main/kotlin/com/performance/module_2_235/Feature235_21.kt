package com.performance.module_2_235

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature235ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature235State0.INITIAL)
    val state: StateFlow<Feature235State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature235State0.LOADING
            // Simulate some work
            _state.value = Feature235State0.SUCCESS
        }
    }
}
