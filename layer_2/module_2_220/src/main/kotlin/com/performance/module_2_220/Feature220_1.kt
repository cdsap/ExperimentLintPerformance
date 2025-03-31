package com.performance.module_2_220

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_149.Feature149Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_196.Feature196Repository
import com.performance.module_1_171.Feature171Repository
import com.performance.module_1_143.Feature143Repository

class Feature220ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature149Repository()
        private val repository1 = Feature183Repository()
        private val repository2 = Feature174Repository()
        private val repository3 = Feature196Repository()
        private val repository4 = Feature171Repository()
        private val repository5 = Feature143Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 220"
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
