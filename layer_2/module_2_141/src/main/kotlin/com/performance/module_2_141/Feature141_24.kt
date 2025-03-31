package com.performance.module_2_141

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature141ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature141State0.INITIAL)
    val state: StateFlow<Feature141State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature141State0.LOADING
            // Simulate some work
            _state.value = Feature141State0.SUCCESS
        }
    }
}
