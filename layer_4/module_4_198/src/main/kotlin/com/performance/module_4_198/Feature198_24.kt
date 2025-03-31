package com.performance.module_4_198

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature198ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature198State0.INITIAL)
    val state: StateFlow<Feature198State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature198State0.LOADING
            // Simulate some work
            _state.value = Feature198State0.SUCCESS
        }
    }
}
