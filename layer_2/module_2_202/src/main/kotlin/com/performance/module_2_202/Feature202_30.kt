package com.performance.module_2_202

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature202ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature202State0.INITIAL)
    val state: StateFlow<Feature202State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature202State0.LOADING
            // Simulate some work
            _state.value = Feature202State0.SUCCESS
        }
    }
}
