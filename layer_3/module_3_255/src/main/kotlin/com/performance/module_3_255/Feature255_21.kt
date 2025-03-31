package com.performance.module_3_255

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature255ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature255State0.INITIAL)
    val state: StateFlow<Feature255State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature255State0.LOADING
            // Simulate some work
            _state.value = Feature255State0.SUCCESS
        }
    }
}
