package com.performance.module_3_264

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature264ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature264State0.INITIAL)
    val state: StateFlow<Feature264State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature264State0.LOADING
            // Simulate some work
            _state.value = Feature264State0.SUCCESS
        }
    }
}
