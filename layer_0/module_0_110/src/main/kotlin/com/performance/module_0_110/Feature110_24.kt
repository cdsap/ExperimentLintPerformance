package com.performance.module_0_110

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature110ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature110State0.INITIAL)
    val state: StateFlow<Feature110State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature110State0.LOADING
            // Simulate some work
            _state.value = Feature110State0.SUCCESS
        }
    }
}
