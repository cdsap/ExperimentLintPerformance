package com.performance.module_2_201

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_184.Feature184Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_177.Feature177Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_162.Feature162Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_179.Feature179Repository
import com.performance.module_1_194.Feature194Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_164.Feature164Repository

class Feature201ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature184Repository()
        private val repository1 = Feature183Repository()
        private val repository2 = Feature177Repository()
        private val repository3 = Feature142Repository()
        private val repository4 = Feature158Repository()
        private val repository5 = Feature162Repository()
        private val repository6 = Feature153Repository()
        private val repository7 = Feature179Repository()
        private val repository8 = Feature194Repository()
        private val repository9 = Feature157Repository()
        private val repository10 = Feature164Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 201"
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
