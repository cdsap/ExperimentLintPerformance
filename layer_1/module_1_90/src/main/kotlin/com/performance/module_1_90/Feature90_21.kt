package com.performance.module_1_90

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature90ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature90State0.INITIAL)
    val state: StateFlow<Feature90State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature90State0.LOADING
            // Simulate some work
            _state.value = Feature90State0.SUCCESS
        }
    }
}
