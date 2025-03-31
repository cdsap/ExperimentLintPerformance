package com.performance.module_4_200

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature200ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature200State0.INITIAL)
    val state: StateFlow<Feature200State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature200State0.LOADING
            // Simulate some work
            _state.value = Feature200State0.SUCCESS
        }
    }
}
