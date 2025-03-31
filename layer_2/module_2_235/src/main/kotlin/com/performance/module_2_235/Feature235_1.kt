package com.performance.module_2_235

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_196.Feature196Repository
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_165.Feature165Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_154.Feature154Repository

class Feature235ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature155Repository()
        private val repository1 = Feature193Repository()
        private val repository2 = Feature196Repository()
        private val repository3 = Feature192Repository()
        private val repository4 = Feature139Repository()
        private val repository5 = Feature152Repository()
        private val repository6 = Feature147Repository()
        private val repository7 = Feature165Repository()
        private val repository8 = Feature174Repository()
        private val repository9 = Feature159Repository()
        private val repository10 = Feature178Repository()
        private val repository11 = Feature144Repository()
        private val repository12 = Feature154Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 235"
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
                repository11.getData()
                repository12.getData()
            }
        }
    }
}
