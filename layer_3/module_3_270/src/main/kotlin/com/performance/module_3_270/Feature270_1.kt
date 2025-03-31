package com.performance.module_3_270

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_214.Feature214Repository

class Feature270ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature217Repository()
        private val repository1 = Feature199Repository()
        private val repository2 = Feature225Repository()
        private val repository3 = Feature230Repository()
        private val repository4 = Feature203Repository()
        private val repository5 = Feature214Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 270"
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
