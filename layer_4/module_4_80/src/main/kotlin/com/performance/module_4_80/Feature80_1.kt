package com.performance.module_4_80

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_70.Feature70Repository
import com.performance.module_3_69.Feature69Repository
import com.performance.module_3_61.Feature61Repository

class Feature80ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature70Repository()
        private val repository1 = Feature69Repository()
        private val repository2 = Feature61Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 80"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
