package com.performance.module_4_277

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_249.Feature249Repository
import com.performance.module_3_270.Feature270Repository

class Feature277ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature268Repository()
        private val repository1 = Feature263Repository()
        private val repository2 = Feature249Repository()
        private val repository3 = Feature270Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 277"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
