package com.performance.module_2_155

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_103.Feature103Repository
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_127.Feature127Repository
import com.performance.module_1_117.Feature117Repository
import com.performance.module_1_128.Feature128Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_121.Feature121Repository

class Feature155ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature103Repository()
        private val repository1 = Feature129Repository()
        private val repository2 = Feature110Repository()
        private val repository3 = Feature102Repository()
        private val repository4 = Feature127Repository()
        private val repository5 = Feature117Repository()
        private val repository6 = Feature128Repository()
        private val repository7 = Feature109Repository()
        private val repository8 = Feature121Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 155"
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
