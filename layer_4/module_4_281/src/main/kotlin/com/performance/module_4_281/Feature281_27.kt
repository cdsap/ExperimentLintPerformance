package com.performance.module_4_281

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature281ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature281State0.INITIAL)
    val state: StateFlow<Feature281State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature281State0.LOADING
            // Simulate some work
            _state.value = Feature281State0.SUCCESS
        }
    }
}
