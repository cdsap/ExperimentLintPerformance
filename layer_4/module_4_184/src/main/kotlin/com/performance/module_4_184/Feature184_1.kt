package com.performance.module_4_184

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_172.Feature172Repository
import com.performance.module_3_176.Feature176Repository
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_173.Feature173Repository

class Feature184ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature179Repository()
        private val repository1 = Feature172Repository()
        private val repository2 = Feature176Repository()
        private val repository3 = Feature178Repository()
        private val repository4 = Feature166Repository()
        private val repository5 = Feature173Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 184"
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
