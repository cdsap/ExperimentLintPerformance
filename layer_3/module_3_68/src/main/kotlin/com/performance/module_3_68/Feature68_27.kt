package com.performance.module_3_68

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature68ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature68State0.INITIAL)
    val state: StateFlow<Feature68State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature68State0.LOADING
            // Simulate some work
            _state.value = Feature68State0.SUCCESS
        }
    }
}
