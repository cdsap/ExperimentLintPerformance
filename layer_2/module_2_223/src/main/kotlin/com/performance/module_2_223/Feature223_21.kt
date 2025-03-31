package com.performance.module_2_223

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature223ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature223State0.INITIAL)
    val state: StateFlow<Feature223State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature223State0.LOADING
            // Simulate some work
            _state.value = Feature223State0.SUCCESS
        }
    }
}
