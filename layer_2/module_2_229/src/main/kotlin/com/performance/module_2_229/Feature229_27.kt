package com.performance.module_2_229

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature229ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature229State0.INITIAL)
    val state: StateFlow<Feature229State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature229State0.LOADING
            // Simulate some work
            _state.value = Feature229State0.SUCCESS
        }
    }
}
