package com.performance.module_1_28

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_8.Feature8Repository

class Feature28ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature1Repository()
        private val repository1 = Feature12Repository()
        private val repository2 = Feature9Repository()
        private val repository3 = Feature8Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 28"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
