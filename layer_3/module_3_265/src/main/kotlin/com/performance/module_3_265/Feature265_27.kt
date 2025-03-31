package com.performance.module_3_265

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature265ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature265State0.INITIAL)
    val state: StateFlow<Feature265State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature265State0.LOADING
            // Simulate some work
            _state.value = Feature265State0.SUCCESS
        }
    }
}
