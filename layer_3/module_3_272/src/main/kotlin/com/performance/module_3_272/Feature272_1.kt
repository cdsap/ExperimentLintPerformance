package com.performance.module_3_272

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_209.Feature209Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_241.Feature241Repository
import com.performance.module_2_207.Feature207Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_224.Feature224Repository
import com.performance.module_2_222.Feature222Repository

class Feature272ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature209Repository()
        private val repository1 = Feature216Repository()
        private val repository2 = Feature241Repository()
        private val repository3 = Feature207Repository()
        private val repository4 = Feature230Repository()
        private val repository5 = Feature232Repository()
        private val repository6 = Feature225Repository()
        private val repository7 = Feature224Repository()
        private val repository8 = Feature222Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 272"
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
