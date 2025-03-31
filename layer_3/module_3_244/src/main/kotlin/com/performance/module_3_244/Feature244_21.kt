package com.performance.module_3_244

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature244ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature244State0.INITIAL)
    val state: StateFlow<Feature244State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature244State0.LOADING
            // Simulate some work
            _state.value = Feature244State0.SUCCESS
        }
    }
}
