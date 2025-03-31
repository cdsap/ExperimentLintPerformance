package com.performance.module_3_261

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_229.Feature229Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_233.Feature233Repository

class Feature261ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature229Repository()
        private val repository1 = Feature227Repository()
        private val repository2 = Feature233Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 261"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
