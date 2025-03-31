package com.performance.module_2_227

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_187.Feature187Repository
import com.performance.module_1_140.Feature140Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_145.Feature145Repository

class Feature227ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature170Repository()
        private val repository1 = Feature153Repository()
        private val repository2 = Feature187Repository()
        private val repository3 = Feature140Repository()
        private val repository4 = Feature174Repository()
        private val repository5 = Feature145Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 227"
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
