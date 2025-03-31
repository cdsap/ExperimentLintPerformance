package com.performance.module_3_258

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_214.Feature214Repository
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_225.Feature225Repository

class Feature258ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature232Repository()
        private val repository1 = Feature219Repository()
        private val repository2 = Feature228Repository()
        private val repository3 = Feature222Repository()
        private val repository4 = Feature230Repository()
        private val repository5 = Feature227Repository()
        private val repository6 = Feature214Repository()
        private val repository7 = Feature204Repository()
        private val repository8 = Feature225Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 258"
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
