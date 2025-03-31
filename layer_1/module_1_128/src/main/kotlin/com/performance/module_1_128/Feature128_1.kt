package com.performance.module_1_128

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_9.Feature9Repository

class Feature128ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature81Repository()
        private val repository1 = Feature8Repository()
        private val repository2 = Feature9Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 128"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
