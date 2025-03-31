package com.performance.module_4_79

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature79ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature79State0.INITIAL)
    val state: StateFlow<Feature79State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature79State0.LOADING
            // Simulate some work
            _state.value = Feature79State0.SUCCESS
        }
    }
}
