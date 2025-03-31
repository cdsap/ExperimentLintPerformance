package com.performance.module_3_178

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature178ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature178State0.INITIAL)
    val state: StateFlow<Feature178State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature178State0.LOADING
            // Simulate some work
            _state.value = Feature178State0.SUCCESS
        }
    }
}
