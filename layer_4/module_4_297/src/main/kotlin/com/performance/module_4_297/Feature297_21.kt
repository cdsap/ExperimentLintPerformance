package com.performance.module_4_297

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature297ViewModel0 : ViewModel() {
    private val _state = MutableStateFlow(Feature297State0.INITIAL)
    val state: StateFlow<Feature297State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature297State0.LOADING
            // Simulate some work
            _state.value = Feature297State0.SUCCESS
        }
    }
}
