package com.performance.module_0_27

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature27ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature27State0.INITIAL)
    val state: StateFlow<Feature27State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature27State0.LOADING
            // Simulate some work
            _state.value = Feature27State0.SUCCESS
        }
    }
}
