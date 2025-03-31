package com.performance.module_3_259

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature259ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature259State0.INITIAL)
    val state: StateFlow<Feature259State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature259State0.LOADING
            // Simulate some work
            _state.value = Feature259State0.SUCCESS
        }
    }
}
