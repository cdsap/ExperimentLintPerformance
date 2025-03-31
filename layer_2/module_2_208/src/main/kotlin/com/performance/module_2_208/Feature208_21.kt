package com.performance.module_2_208

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature208ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature208State0.INITIAL)
    val state: StateFlow<Feature208State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature208State0.LOADING
            // Simulate some work
            _state.value = Feature208State0.SUCCESS
        }
    }
}
