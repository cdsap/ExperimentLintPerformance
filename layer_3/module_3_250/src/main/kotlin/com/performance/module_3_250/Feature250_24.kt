package com.performance.module_3_250

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature250ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature250State0.INITIAL)
    val state: StateFlow<Feature250State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature250State0.LOADING
            // Simulate some work
            _state.value = Feature250State0.SUCCESS
        }
    }
}
