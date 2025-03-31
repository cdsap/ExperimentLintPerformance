package com.performance.module_1_35

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_2.Feature2Repository

class Feature35ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature10Repository()
        private val repository1 = Feature1Repository()
        private val repository2 = Feature3Repository()
        private val repository3 = Feature9Repository()
        private val repository4 = Feature4Repository()
        private val repository5 = Feature2Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 35"
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
