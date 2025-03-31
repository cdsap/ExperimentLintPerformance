package com.performance.module_1_191

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature191ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature191State0.INITIAL)
    val state: StateFlow<Feature191State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature191State0.LOADING
            // Simulate some work
            _state.value = Feature191State0.SUCCESS
        }
    }
}
