package com.performance.module_1_167

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature167ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature167State0.INITIAL)
    val state: StateFlow<Feature167State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature167State0.LOADING
            // Simulate some work
            _state.value = Feature167State0.SUCCESS
        }
    }
}
