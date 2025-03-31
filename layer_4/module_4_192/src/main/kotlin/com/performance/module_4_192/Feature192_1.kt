package com.performance.module_4_192

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_168.Feature168Repository
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_174.Feature174Repository
import com.performance.module_3_165.Feature165Repository
import com.performance.module_3_164.Feature164Repository
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_169.Feature169Repository

class Feature192ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature168Repository()
        private val repository1 = Feature178Repository()
        private val repository2 = Feature174Repository()
        private val repository3 = Feature165Repository()
        private val repository4 = Feature164Repository()
        private val repository5 = Feature170Repository()
        private val repository6 = Feature182Repository()
        private val repository7 = Feature179Repository()
        private val repository8 = Feature169Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 192"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
            }
        }
    }
}
