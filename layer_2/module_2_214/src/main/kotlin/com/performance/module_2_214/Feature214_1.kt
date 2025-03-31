package com.performance.module_2_214

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_179.Feature179Repository
import com.performance.module_1_195.Feature195Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_156.Feature156Repository
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_187.Feature187Repository
import com.performance.module_1_175.Feature175Repository
import com.performance.module_1_138.Feature138Repository

class Feature214ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature139Repository()
        private val repository1 = Feature179Repository()
        private val repository2 = Feature195Repository()
        private val repository3 = Feature154Repository()
        private val repository4 = Feature156Repository()
        private val repository5 = Feature192Repository()
        private val repository6 = Feature182Repository()
        private val repository7 = Feature189Repository()
        private val repository8 = Feature187Repository()
        private val repository9 = Feature175Repository()
        private val repository10 = Feature138Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 214"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
                repository9.getData()
                repository10.getData()
            }
        }
    }
}
