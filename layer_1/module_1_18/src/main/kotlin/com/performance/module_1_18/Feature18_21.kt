package com.performance.module_1_18

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature18ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature18State0.INITIAL)
    val state: StateFlow<Feature18State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature18State0.LOADING
            // Simulate some work
            _state.value = Feature18State0.SUCCESS
        }
    }
}
