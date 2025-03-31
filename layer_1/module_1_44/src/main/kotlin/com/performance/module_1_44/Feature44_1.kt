package com.performance.module_1_44

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_14.Feature14Repository

class Feature44ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature5Repository()
        private val repository1 = Feature7Repository()
        private val repository2 = Feature15Repository()
        private val repository3 = Feature3Repository()
        private val repository4 = Feature13Repository()
        private val repository5 = Feature14Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 44"
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
