package com.performance.module_3_67

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature67ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature67State0.INITIAL)
    val state: StateFlow<Feature67State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature67State0.LOADING
            // Simulate some work
            _state.value = Feature67State0.SUCCESS
        }
    }
}
