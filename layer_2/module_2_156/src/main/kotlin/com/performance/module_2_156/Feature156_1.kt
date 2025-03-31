package com.performance.module_2_156

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_90.Feature90Repository

class Feature156ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature96Repository()
        private val repository1 = Feature90Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 156"
                repository0.getData()
                repository1.getData()
            }
        }
    }
}
