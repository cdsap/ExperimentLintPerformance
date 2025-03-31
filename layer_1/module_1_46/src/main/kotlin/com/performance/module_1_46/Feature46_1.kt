package com.performance.module_1_46

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_15.Feature15Repository

class Feature46ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature10Repository()
        private val repository1 = Feature11Repository()
        private val repository2 = Feature3Repository()
        private val repository3 = Feature4Repository()
        private val repository4 = Feature8Repository()
        private val repository5 = Feature15Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 46"
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
