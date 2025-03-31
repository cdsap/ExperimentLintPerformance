package com.performance.module_2_228

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature228ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature228State0.INITIAL)
    val state: StateFlow<Feature228State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature228State0.LOADING
            // Simulate some work
            _state.value = Feature228State0.SUCCESS
        }
    }
}
