package com.performance.module_2_230

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature230ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature230State0.INITIAL)
    val state: StateFlow<Feature230State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature230State0.LOADING
            // Simulate some work
            _state.value = Feature230State0.SUCCESS
        }
    }
}
