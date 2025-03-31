package com.performance.module_2_217

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature217ViewModel3 : ViewModel() {
    private val _state = MutableStateFlow(Feature217State0.INITIAL)
    val state: StateFlow<Feature217State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature217State0.LOADING
            // Simulate some work
            _state.value = Feature217State0.SUCCESS
        }
    }
}
