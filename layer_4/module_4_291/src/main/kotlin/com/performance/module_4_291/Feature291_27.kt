package com.performance.module_4_291

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature291ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature291State0.INITIAL)
    val state: StateFlow<Feature291State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature291State0.LOADING
            // Simulate some work
            _state.value = Feature291State0.SUCCESS
        }
    }
}
