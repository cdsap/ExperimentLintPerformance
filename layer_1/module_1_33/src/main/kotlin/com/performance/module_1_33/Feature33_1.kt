package com.performance.module_1_33

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_5.Feature5Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_14.Feature14Repository

class Feature33ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature10Repository()
        private val repository1 = Feature5Repository()
        private val repository2 = Feature9Repository()
        private val repository3 = Feature14Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 33"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
