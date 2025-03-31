package com.performance.module_5_88

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature88ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature88State0.INITIAL)
    val state: StateFlow<Feature88State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature88State0.LOADING
            // Simulate some work
            _state.value = Feature88State0.SUCCESS
        }
    }
}
