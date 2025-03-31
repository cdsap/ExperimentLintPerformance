package com.performance.module_3_257

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature257ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature257State0.INITIAL)
    val state: StateFlow<Feature257State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature257State0.LOADING
            // Simulate some work
            _state.value = Feature257State0.SUCCESS
        }
    }
}
