package com.performance.module_0_85

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature85ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature85State0.INITIAL)
    val state: StateFlow<Feature85State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature85State0.LOADING
            // Simulate some work
            _state.value = Feature85State0.SUCCESS
        }
    }
}
