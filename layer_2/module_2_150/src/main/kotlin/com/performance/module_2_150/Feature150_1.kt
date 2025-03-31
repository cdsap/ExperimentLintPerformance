package com.performance.module_2_150

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_118.Feature118Repository
import com.performance.module_1_102.Feature102Repository

class Feature150ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature96Repository()
        private val repository1 = Feature115Repository()
        private val repository2 = Feature129Repository()
        private val repository3 = Feature118Repository()
        private val repository4 = Feature102Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 150"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
