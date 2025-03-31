package com.performance.module_2_134

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature134ViewModel1 : ViewModel() {
    private val _state = MutableStateFlow(Feature134State0.INITIAL)
    val state: StateFlow<Feature134State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature134State0.LOADING
            // Simulate some work
            _state.value = Feature134State0.SUCCESS
        }
    }
}
