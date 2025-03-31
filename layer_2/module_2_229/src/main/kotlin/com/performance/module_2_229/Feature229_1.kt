package com.performance.module_2_229

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_133.Feature133Repository
import com.performance.module_1_137.Feature137Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_194.Feature194Repository
import com.performance.module_1_174.Feature174Repository

class Feature229ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature153Repository()
        private val repository1 = Feature133Repository()
        private val repository2 = Feature137Repository()
        private val repository3 = Feature158Repository()
        private val repository4 = Feature194Repository()
        private val repository5 = Feature174Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 229"
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
