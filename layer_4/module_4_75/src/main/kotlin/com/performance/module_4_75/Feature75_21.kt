package com.performance.module_4_75

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature75ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature75State0.INITIAL)
    val state: StateFlow<Feature75State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature75State0.LOADING
            // Simulate some work
            _state.value = Feature75State0.SUCCESS
        }
    }
}
