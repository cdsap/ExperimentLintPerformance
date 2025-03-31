package com.performance.module_1_24

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature24ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature24State0.INITIAL)
    val state: StateFlow<Feature24State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature24State0.LOADING
            // Simulate some work
            _state.value = Feature24State0.SUCCESS
        }
    }
}
