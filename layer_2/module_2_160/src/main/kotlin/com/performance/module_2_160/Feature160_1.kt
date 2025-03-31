package com.performance.module_2_160

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_104.Feature104Repository
import com.performance.module_1_123.Feature123Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_126.Feature126Repository

class Feature160ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature132Repository()
        private val repository1 = Feature104Repository()
        private val repository2 = Feature123Repository()
        private val repository3 = Feature95Repository()
        private val repository4 = Feature96Repository()
        private val repository5 = Feature126Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 160"
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
