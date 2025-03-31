package com.performance.module_3_182

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_141.Feature141Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_137.Feature137Repository

class Feature182ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature155Repository()
        private val repository1 = Feature156Repository()
        private val repository2 = Feature138Repository()
        private val repository3 = Feature141Repository()
        private val repository4 = Feature135Repository()
        private val repository5 = Feature137Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 182"
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
