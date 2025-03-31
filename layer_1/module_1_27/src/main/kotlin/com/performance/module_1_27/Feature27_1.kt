package com.performance.module_1_27

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_5.Feature5Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_8.Feature8Repository

class Feature27ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature9Repository()
        private val repository1 = Feature7Repository()
        private val repository2 = Feature5Repository()
        private val repository3 = Feature15Repository()
        private val repository4 = Feature14Repository()
        private val repository5 = Feature8Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 27"
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
