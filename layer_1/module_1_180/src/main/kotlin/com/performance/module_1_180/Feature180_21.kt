package com.performance.module_1_180

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature180ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature180State0.INITIAL)
    val state: StateFlow<Feature180State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature180State0.LOADING
            // Simulate some work
            _state.value = Feature180State0.SUCCESS
        }
    }
}
