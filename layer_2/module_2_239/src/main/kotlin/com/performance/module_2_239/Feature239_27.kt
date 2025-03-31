package com.performance.module_2_239

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature239ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature239State0.INITIAL)
    val state: StateFlow<Feature239State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature239State0.LOADING
            // Simulate some work
            _state.value = Feature239State0.SUCCESS
        }
    }
}
