package com.performance.module_4_284

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature284ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature284State0.INITIAL)
    val state: StateFlow<Feature284State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature284State0.LOADING
            // Simulate some work
            _state.value = Feature284State0.SUCCESS
        }
    }
}
