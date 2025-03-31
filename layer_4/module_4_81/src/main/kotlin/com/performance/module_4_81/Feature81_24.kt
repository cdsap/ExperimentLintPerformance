package com.performance.module_4_81

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature81ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature81State0.INITIAL)
    val state: StateFlow<Feature81State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature81State0.LOADING
            // Simulate some work
            _state.value = Feature81State0.SUCCESS
        }
    }
}
