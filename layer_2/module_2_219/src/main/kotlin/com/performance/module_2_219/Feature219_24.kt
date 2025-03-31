package com.performance.module_2_219

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature219ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature219State0.INITIAL)
    val state: StateFlow<Feature219State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature219State0.LOADING
            // Simulate some work
            _state.value = Feature219State0.SUCCESS
        }
    }
}
