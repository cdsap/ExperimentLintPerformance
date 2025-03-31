package com.performance.module_1_194

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class Feature194ViewModel2 : ViewModel() {
    private val _state = MutableStateFlow(Feature194State0.INITIAL)
    val state: StateFlow<Feature194State0> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = Feature194State0.LOADING
            // Simulate some work
            _state.value = Feature194State0.SUCCESS
        }
    }
}
