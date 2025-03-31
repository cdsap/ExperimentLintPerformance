package com.performance.module_3_266

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature266ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature266State0.INITIAL)
    val state: StateFlow<Feature266State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature266State0.LOADING
            // Simulate some work
            _state.value = Feature266State0.SUCCESS
        }
    }
}
