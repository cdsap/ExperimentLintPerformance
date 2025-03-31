package com.performance.module_1_47

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_11.Feature11Repository

class Feature47ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature4Repository()
        private val repository1 = Feature14Repository()
        private val repository2 = Feature11Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 47"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
