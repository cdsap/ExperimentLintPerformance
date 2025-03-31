package com.performance.module_2_215

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature215ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature215State0.INITIAL)
    val state: StateFlow<Feature215State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature215State0.LOADING
            // Simulate some work
            _state.value = Feature215State0.SUCCESS
        }
    }
}
