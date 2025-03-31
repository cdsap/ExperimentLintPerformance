package com.performance.module_2_241

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_135.Feature135Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_197.Feature197Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_178.Feature178Repository

class Feature241ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature135Repository()
        private val repository1 = Feature142Repository()
        private val repository2 = Feature153Repository()
        private val repository3 = Feature193Repository()
        private val repository4 = Feature182Repository()
        private val repository5 = Feature197Repository()
        private val repository6 = Feature174Repository()
        private val repository7 = Feature178Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 241"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
            }
        }
    }
}
