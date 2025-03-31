package com.performance.module_1_26

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_7.Feature7Repository

class Feature26ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature9Repository()
        private val repository1 = Feature8Repository()
        private val repository2 = Feature13Repository()
        private val repository3 = Feature7Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 26"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
