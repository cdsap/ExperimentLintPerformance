package com.performance.module_5_201

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature201ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature201State0.INITIAL)
    val state: StateFlow<Feature201State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature201State0.LOADING
            // Simulate some work
            _state.value = Feature201State0.SUCCESS
        }
    }
}
