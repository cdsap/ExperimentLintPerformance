package com.performance.module_1_39

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_6.Feature6Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_4.Feature4Repository

class Feature39ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature6Repository()
        private val repository1 = Feature9Repository()
        private val repository2 = Feature10Repository()
        private val repository3 = Feature14Repository()
        private val repository4 = Feature7Repository()
        private val repository5 = Feature4Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 39"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
            }
        }
    }
}
