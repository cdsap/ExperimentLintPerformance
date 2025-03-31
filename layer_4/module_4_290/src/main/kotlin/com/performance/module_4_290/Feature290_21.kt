package com.performance.module_4_290

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature290ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature290State0.INITIAL)
    val state: StateFlow<Feature290State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature290State0.LOADING
            // Simulate some work
            _state.value = Feature290State0.SUCCESS
        }
    }
}
