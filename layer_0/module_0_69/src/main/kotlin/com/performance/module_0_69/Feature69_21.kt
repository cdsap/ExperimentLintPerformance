package com.performance.module_0_69

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature69ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature69State0.INITIAL)
    val state: StateFlow<Feature69State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature69State0.LOADING
            // Simulate some work
            _state.value = Feature69State0.SUCCESS
        }
    }
}
