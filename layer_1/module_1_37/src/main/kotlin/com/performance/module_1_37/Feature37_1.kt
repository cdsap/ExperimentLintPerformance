package com.performance.module_1_37

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_11.Feature11Repository

class Feature37ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature13Repository()
        private val repository1 = Feature15Repository()
        private val repository2 = Feature4Repository()
        private val repository3 = Feature3Repository()
        private val repository4 = Feature2Repository()
        private val repository5 = Feature10Repository()
        private val repository6 = Feature11Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 37"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
            }
        }
    }
}
