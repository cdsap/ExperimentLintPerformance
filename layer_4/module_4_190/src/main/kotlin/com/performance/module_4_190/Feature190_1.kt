package com.performance.module_4_190

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_172.Feature172Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_183.Feature183Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_169.Feature169Repository
import com.performance.module_3_177.Feature177Repository

class Feature190ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature166Repository()
        private val repository1 = Feature172Repository()
        private val repository2 = Feature179Repository()
        private val repository3 = Feature178Repository()
        private val repository4 = Feature183Repository()
        private val repository5 = Feature181Repository()
        private val repository6 = Feature170Repository()
        private val repository7 = Feature169Repository()
        private val repository8 = Feature177Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 190"
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
