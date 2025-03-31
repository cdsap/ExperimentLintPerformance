package com.performance.module_1_113

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature113ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature113State0.INITIAL)
    val state: StateFlow<Feature113State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature113State0.LOADING
            // Simulate some work
            _state.value = Feature113State0.SUCCESS
        }
    }
}
