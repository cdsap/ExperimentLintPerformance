package com.performance.module_1_144

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_24.Feature24Repository
import com.performance.module_0_127.Feature127Repository
import com.performance.module_0_116.Feature116Repository

class Feature144ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature24Repository()
        private val repository1 = Feature127Repository()
        private val repository2 = Feature116Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 144"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
