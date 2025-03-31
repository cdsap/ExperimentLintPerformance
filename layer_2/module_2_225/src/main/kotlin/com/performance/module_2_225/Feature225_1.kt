package com.performance.module_2_225

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_168.Feature168Repository

class Feature225ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature170Repository()
        private val repository1 = Feature174Repository()
        private val repository2 = Feature144Repository()
        private val repository3 = Feature182Repository()
        private val repository4 = Feature159Repository()
        private val repository5 = Feature168Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 225"
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
