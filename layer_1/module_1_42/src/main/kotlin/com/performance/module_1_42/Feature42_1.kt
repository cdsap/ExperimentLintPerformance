package com.performance.module_1_42

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_14.Feature14Repository

class Feature42ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature2Repository()
        private val repository1 = Feature11Repository()
        private val repository2 = Feature13Repository()
        private val repository3 = Feature14Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 42"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
