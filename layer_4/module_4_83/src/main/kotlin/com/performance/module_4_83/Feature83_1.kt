package com.performance.module_4_83

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_52.Feature52Repository
import com.performance.module_3_53.Feature53Repository

class Feature83ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature64Repository()
        private val repository1 = Feature52Repository()
        private val repository2 = Feature53Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 83"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
