package com.performance.module_3_66

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature66ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature66State0.INITIAL)
    val state: StateFlow<Feature66State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature66State0.LOADING
            // Simulate some work
            _state.value = Feature66State0.SUCCESS
        }
    }
}
