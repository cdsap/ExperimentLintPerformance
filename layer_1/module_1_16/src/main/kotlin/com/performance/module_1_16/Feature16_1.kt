package com.performance.module_1_16

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_4.Feature4Repository

class Feature16ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature11Repository()
        private val repository1 = Feature15Repository()
        private val repository2 = Feature3Repository()
        private val repository3 = Feature4Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 16"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
