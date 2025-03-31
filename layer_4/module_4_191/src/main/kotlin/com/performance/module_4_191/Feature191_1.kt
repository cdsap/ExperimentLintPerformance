package com.performance.module_4_191

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_168.Feature168Repository
import com.performance.module_3_172.Feature172Repository
import com.performance.module_3_171.Feature171Repository
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_177.Feature177Repository

class Feature191ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature166Repository()
        private val repository1 = Feature168Repository()
        private val repository2 = Feature172Repository()
        private val repository3 = Feature171Repository()
        private val repository4 = Feature175Repository()
        private val repository5 = Feature177Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 191"
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
