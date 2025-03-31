package com.performance.module_1_154

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature154ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature154State0.INITIAL)
    val state: StateFlow<Feature154State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature154State0.LOADING
            // Simulate some work
            _state.value = Feature154State0.SUCCESS
        }
    }
}
