package com.performance.module_0_49

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature49ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature49State0.INITIAL)
    val state: StateFlow<Feature49State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature49State0.LOADING
            // Simulate some work
            _state.value = Feature49State0.SUCCESS
        }
    }
}
