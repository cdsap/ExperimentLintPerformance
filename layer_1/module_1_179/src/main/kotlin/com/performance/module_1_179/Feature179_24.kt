package com.performance.module_1_179

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature179ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature179State0.INITIAL)
    val state: StateFlow<Feature179State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature179State0.LOADING
            // Simulate some work
            _state.value = Feature179State0.SUCCESS
        }
    }
}
