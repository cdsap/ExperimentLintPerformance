package com.performance.module_1_158

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature158ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature158State0.INITIAL)
    val state: StateFlow<Feature158State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature158State0.LOADING
            // Simulate some work
            _state.value = Feature158State0.SUCCESS
        }
    }
}
